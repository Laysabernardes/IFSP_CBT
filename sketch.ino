#include <WiFi.h>
#include <DHT.h>
#include <Wire.h>
#include <LiquidCrystal_I2C.h>
#include <ThingSpeak.h>

// --- Configurações Gerais ---
#define I2C_ADDR    0x27
#define LCD_COLUMNS 20
#define LCD_LINES   4

// --- Pinos dos Sensores e Atuadores ---
#define PHOTORESISTOR 34
#define DHTPIN 27
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

// --- Credenciais WiFi ---
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

void setup() {
  Serial.begin(115200);
  Wire.begin(21, 22);

  pinMode(LED_VERMELHA, OUTPUT);
  pinMode(LED_AMARELA, OUTPUT);
  pinMode(LED_VERDE, OUTPUT);
  pinMode(BUZZER_PIN, OUTPUT);

  lcd.init();
  lcd.backlight();
  lcd.setCursor(0, 0);
  lcd.print("Conectando...");

  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println("\nWiFi conectado");

  lcd.setCursor(0, 1);
  lcd.print("WiFi OK");

  ThingSpeak.begin(client);
  dht.begin();
}

void loop() {
  unsigned long currentMillis = millis();
  if (currentMillis - previousMillis >= interval) {
    previousMillis = currentMillis;
    sendSensor();
  }
}

void sendSensor() {
  float umidade = dht.readHumidity();
  float temperatura = dht.readTemperature();
  int luminosidade_raw = analogRead(PHOTORESISTOR);
  
  float lux;
  if (luminosidade_raw >= 4095) {
    lux = 0;
  } else {
    float voltage = luminosidade_raw / 4095.0 * 3.3;
    float resistance = (10000.0 * voltage) / (3.3 - voltage);
    lux = 10.0 * pow(resistance / 50000.0, -1.0 / 0.7);
  }

  if (isnan(umidade) || isnan(temperatura) || isinf(lux)) {
    lcd.clear();
    lcd.setCursor(0, 0);
    lcd.print("Erro nos sensores!");
    return;
  }

  bool alertaTemp = (temperatura > TEMP_MAX || temperatura < TEMP_MIN);
  bool alertaUmid = (umidade > UMID_MAX || umidade < UMID_MIN);
  bool alertaLuz = (lux > LUZ_ALTA);

  bool buzzerState = alertaTemp || alertaUmid || alertaLuz;

  bool ledVermelhoState = alertaUmid || alertaLuz;
  bool ledAmareloState = alertaTemp || (lux >= LUZ_MEDIA_MIN && lux <= LUZ_MEDIA_MAX && !alertaUmid && !alertaLuz);
  bool ledVerdeState = (lux < LUZ_MEDIA_MIN) && !alertaTemp && !alertaUmid;

  digitalWrite(BUZZER_PIN, buzzerState);
  digitalWrite(LED_VERMELHA, ledVermelhoState);
  digitalWrite(LED_AMARELA, ledAmareloState);
  digitalWrite(LED_VERDE, ledVerdeState);

  // --- Enviar dados ao ThingSpeak ---
  ThingSpeak.setField(1, temperatura);
  ThingSpeak.setField(2, umidade);
  ThingSpeak.setField(3, lux);

  int statusCode = ThingSpeak.writeFields(myChannelNumber, myWriteAPIKey);
  if (statusCode == 200) {
    Serial.println("Dados enviados ao ThingSpeak!");
  } else {
    Serial.println("Erro ao enviar: " + String(statusCode));
  }

  // --- LCD ---
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
