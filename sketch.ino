/**
 * @brief Projeto Final: Vinheria Safe - Monitoramento de Adega com ESP32 e ThingSpeak.
 * @details Este projeto monitora a temperatura, umidade e luminosidade de um ambiente,
 * envia os dados para a plataforma ThingSpeak e aciona alertas locais (LEDs, Buzzer, LCD).
 * @authors Beatriz Bastos, Laysa Bernardes, Lucas Cruz, Miguel Luizatto
 */

// Bibliotecas necessárias para o projeto
#include <WiFi.h>                        // Para conexão Wi-Fi
#include <DHT.h>                         // Para o sensor de temperatura e umidade DHT22
#include <Wire.h>                        // Para comunicação I2C com o LCD
#include <LiquidCrystal_I2C.h>           // Para controlar o display LCD via I2C
#include <ThingSpeak.h>                  // Para comunicação com a plataforma ThingSpeak

//--- Configurações Gerais do Display LCD ---
#define I2C_ADDR    0x27                 // Endereço I2C do módulo do LCD
#define LCD_COLUMNS 20
#define LCD_LINES   4

// --- Pinos dos Sensores e Atuadores ---
#define PHOTORESISTOR 34                 // Endereço I2C do módulo do LCD
#define DHTPIN 27                        // Pino do sensor de temperatura e umidade (DHT22)
#define LED_VERMELHA 26
#define LED_AMARELA  25
#define LED_VERDE    33
#define BUZZER_PIN   32
#define DHTTYPE DHT22

// --- Limiares de Decisão ---
#define TEMP_MAX 15.0
#define TEMP_MIN 10.0
#define UMID_MAX 70.0
#define UMID_MIN 50.0
#define LUZ_ALTA 1000 
#define LUZ_MEDIA_MAX 1000
#define LUZ_MEDIA_MIN 100

// --- Credenciais da Rede Wi-Fi (para o Wokwi) ---
const char* ssid = "Wokwi-GUEST";
const char* password = "";

// --- Configurações do ThingSpeak ---
WiFiClient client;
unsigned long myChannelNumber = 3000536;
const char * myWriteAPIKey = "J2Z8BHSK3JBW4W97";

// --- Variáveis Globais ---
DHT dht(DHTPIN, DHTTYPE);
LiquidCrystal_I2C lcd(I2C_ADDR, LCD_COLUMNS, LCD_LINES);
unsigned long previousMillis = 0;
const long interval = 5000;

//================================================================================
// FUNÇÃO SETUP: Executada uma única vez no início
//================================================================================
void setup() {
  // Inicia a comunicação serial para debug
  Serial.begin(115200);
  // Inicia o barramento I2C para o LCD
  Wire.begin(21, 22);

  // Configura os pinos dos atuadores como saída
  pinMode(LED_VERMELHA, OUTPUT);
  pinMode(LED_AMARELA, OUTPUT);
  pinMode(LED_VERDE, OUTPUT);
  pinMode(BUZZER_PIN, OUTPUT);

  // Inicializa e configura o display LCD
  lcd.init();
  lcd.backlight();
  lcd.setCursor(0, 0);
  lcd.print("Conectando...");

  // Conecta à rede Wi-Fi
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println("\nWiFi conectado");
  lcd.setCursor(0, 1);
  lcd.print("WiFi OK");

  // Inicia os serviços do ThingSpeak e do sensor DHT
  ThingSpeak.begin(client);
  dht.begin();
}

//================================================================================
// FUNÇÃO LOOP: Executada continuamente
//================================================================================
void loop() {
  // Controle de tempo não-bloqueante usando millis()
  // Isso permite que o código continue rodando sem travar em um delay()
  unsigned long currentMillis = millis();
  if (currentMillis - previousMillis >= interval) {
    previousMillis = currentMillis;  // Atualiza o tempo da última execução
    sendSensor();                    // Chama a função principal de lógica
  }
}

//================================================================================
// FUNÇÃO SENDSENSOR: Lógica principal do projeto
//================================================================================
void sendSensor() {
  // 1. Leitura dos dados dos sensores
  float umidade = dht.readHumidity();
  float temperatura = dht.readTemperature();
  int luminosidade_raw = analogRead(PHOTORESISTOR);

  // 2. Conversão do valor lido do LDR para uma unidade de Lux (aproximada)
  float lux;
  if (luminosidade_raw >= 4095) {    // Valor máximo do ADC do ESP32 (escuro total)
    lux = 0;
  } else {
    // Fórmula de conversão baseada em um circuito divisor de tensão com resistor de 10kΩ
    float voltage = luminosidade_raw / 4095.0 * 3.3;
    float resistance = (10000.0 * voltage) / (3.3 - voltage);
    lux = 10.0 * pow(resistance / 50000.0, -1.0 / 0.7);
  }
  
  // 3. Validação para garantir que os dados dos sensores são válidos
  if (isnan(umidade) || isnan(temperatura) || isinf(lux)) {
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Erro nos sensores!");
    return;
  }

  // 4. Definição dos estados de alerta com base nos limiares
  bool alertaTemp = (temperatura > TEMP_MAX || temperatura < TEMP_MIN);
  bool alertaUmid = (umidade > UMID_MAX || umidade < UMID_MIN);
  bool alertaLuz = (lux > LUZ_ALTA);

  // 5. Lógica de controle dos atuadores
  // O buzzer toca se QUALQUER alerta estiver ativo.
  bool buzzerState = alertaTemp || alertaUmid || alertaLuz;

  // LED Vermelho (PERIGO): Ativa com alerta de umidade ou luz alta.
  bool ledVermelhoState = alertaUmid || alertaLuz;
  
  // LED Amarelo (ATENÇÃO): Ativa com alerta de temperatura ou se a luz estiver em nível médio.
  bool ledAmareloState = alertaTemp || (lux >= LUZ_MEDIA_MIN && lux <= LUZ_MEDIA_MAX && !alertaUmid && !alertaLuz);
  
  // LED Verde (OK): Ativa apenas se NENHUM alerta estiver ativo e a luz estiver baixa (ideal).
  bool ledVerdeState = (lux < LUZ_MEDIA_MIN) && !alertaTemp && !alertaUmid;
  
  // 6. Acionamento dos atuadores com base nos estados definidos
  digitalWrite(BUZZER_PIN, buzzerState);
  digitalWrite(LED_VERMELHA, ledVermelhoState);
  digitalWrite(LED_AMARELA, ledAmareloState);
  digitalWrite(LED_VERDE, ledVerdeState);

  // 7. Envio dos dados para a plataforma ThingSpeak
  ThingSpeak.setField(1, temperatura);
  ThingSpeak.setField(2, umidade);
  ThingSpeak.setField(3, lux);

  int statusCode = ThingSpeak.writeFields(myChannelNumber, myWriteAPIKey);
  if (statusCode == 200) {
    Serial.println("Dados enviados ao ThingSpeak!");
  } else {
    Serial.println("Erro ao enviar: " + String(statusCode));
  }

  // 8. Atualização das informações no display LCD
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("--- Vinheria Safe --");

  lcd.setCursor(0, 1);
  lcd.print(temperatura, 1);
  lcd.print("C ");
  if (alertaTemp) lcd.print(temperatura > TEMP_MAX ? "(ALTA)" : "(BAIXA)");
  else lcd.print("(OK)");

  lcd.setCursor(0, 2);
  lcd.print(umidade, 1);
  lcd.print("% ");
  if (alertaUmid) lcd.print(umidade > UMID_MAX ? "(ALTA)" : "(BAIXA)");
  else lcd.print("(OK)");

  lcd.setCursor(0, 3);
  lcd.print(lux, 1);
  lcd.print("lx ");
  if (alertaLuz) lcd.print("(CLARO!)");
  else if (lux < LUZ_MEDIA_MIN) lcd.print("(ESCURO)");
  else lcd.print("(NORMAL)");
}
