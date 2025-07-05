# 🍷 Projeto Final: Vinheria Safe 🛡️

### Projeto de IoT para Monitoramento de Adegas, desenvolvido para a disciplina de Introdução à Automação de Ambientes e Processos.

<p align="center">
  <img src="https://img.shields.io/badge/Plataforma-Wokwi-4BC14B?style=for-the-badge&logo=waze&logoColor=white" alt="Plataforma Wokwi">
  <img src="https://img.shields.io/badge/Linguagem-C++%20(Arduino)-00599C?style=for-the-badge&logo=cplusplus&logoColor=white" alt="Linguagem C++">
  <img src="https://img.shields.io/badge/Cloud-ThingSpeak-E63946?style=for-the-badge&logo=mathworks&logoColor=white" alt="Cloud ThingSpeak">
</p>

---

## 📚 Índice

* [1. Descrição do Projeto](#1-descrição-do-projeto-)
* [2. Contexto do Problema](#2-contexto-do-problema-%EF%B8%8F)
* [3. Tecnologias Utilizadas](#3-tecnologias-utilizadas-)
* [4. Explicação de Funcionamento](#4-explicação-de-funcionamento-%EF%B8%8F)
* [5. Instruções para Replicar](#5-instruções-para-replicar-%EF%B8%8F)
* [6. Links e Capturas de Tela](#6-links-e-capturas-de-tela-)
* [7. Autores](#7-autores-)

---

## 1. Descrição do Projeto 📝
Este projeto é um sistema de Internet das Coisas (IoT) totalmente funcional, criado para monitorar em tempo real as condições ambientais de uma adega de vinhos. Desenvolvido no ambiente de simulação Wokwi, ele utiliza um microcontrolador ESP32 para ler variáveis críticas, enviando os dados para a plataforma de nuvem ThingSpeak para visualização remota e análise.

## 2. Contexto do Problema 🤔
A qualidade de um vinho é extremamente sensível ao seu ambiente de armazenamento. Variações podem degradar a bebida e causar perdas significativas. O monitoramento manual é ineficiente e propenso a falhas.

Este projeto ataca diretamente os três fatores mais críticos:
* 🌡️ **Temperatura:** Variações bruscas podem "cozinhar" ou estragar o vinho.
* 💧 **Umidade:** Níveis incorretos afetam a rolha e podem causar mofo.
* ☀️ **Luminosidade:** A exposição à luz degrada os compostos do vinho.

O sistema "Vinheria Safe" oferece uma solução automatizada para garantir a integridade da coleção, prevenindo perdas e preservando a qualidade dos vinhos.

## 3. Tecnologias Utilizadas 💻

* **Hardware:**
    * 🔌 **Microcontrolador:** ESP32 
    * 🌡️ **Sensores:** DHT22 (Temperatura e Umidade), LDR (Luminosidade) 
    * 🔊 **Atuadores:** LEDs (Verde, Amarelo, Vermelho), Buzzer
    * 🖥️ **Display:** LCD 20x4 com interface I2C

* **Plataformas e Software:**
    * 🌐 **Simulador:** Wokwi Simulator [cite: 13
    * 👨‍💻 **Programação:** Arduino Framework (C++)
    * ☁️ **Nuvem IoT:** ThingSpeak (com MATLAB Analysis) 
    * 📂 **Versionamento:** GitHub 

## 4. Explicação de Funcionamento ⚙️

O sistema opera em um ciclo contínuo e inteligente:

1.  📡 **Leitura:** O ESP32 lê os dados dos sensores a cada 5 segundos.
2.  🧠 **Processamento Local:** O código compara os valores com limiares ideais. LEDs de status (🟢 OK, 🟡 Atenção, 🔴 Perigo) e um buzzer fornecem feedback imediato no local. O display LCD mostra os valores e o status em tempo real.
3.  ☁️ **Comunicação com a Nuvem:** Os dados são enviados para um canal no ThingSpeak, onde gráficos públicos são gerados para acompanhamento.

#### 🔔 Notificações Avançadas por E-mail
Para um monitoramento proativo, o sistema utiliza o app **MATLAB Analysis** do ThingSpeak para enviar dois tipos de e-mails:

* 🚨 **Alertas de Emergência:** Se qualquer variável sai da faixa de segurança, um e-mail de alerta é enviado **imediatamente**.
* 📋 **Relatórios Periódicos:** Em intervalos programados, um e-mail com o status geral é enviado. Isso serve como uma "prova de vida" do sistema, confirmando que tudo está online e funcionando.

## 5. Instruções para Replicar 🛠️
1.  **Clone o Repositório:** `git clone [URL_DO_SEU_REPOSITORIO]`
2.  **Hardware:** Monte o circuito no Wokwi conforme a imagem abaixo.
3.  **ThingSpeak:** Crie uma conta e um novo canal. Anote o **Channel ID** e a **Write API Key**.
4.  **Código ESP32:** No arquivo `.ino`, insira seu `Channel ID` e `Write API Key`. Se necessário, altere as credenciais de Wi-Fi.
5.  **Código MATLAB:** No ThingSpeak, vá em `Apps > MATLAB Analysis`. Crie uma nova análise, cole o código de verificação e configure o app "React" ou "TimeControl" para executá-lo.
6.  ▶️ **Execute:** Inicie a simulação no Wokwi e veja a mágica acontecer!

## 6. Links e Capturas de Tela 🔗

* ➡️ **Projeto no Wokwi:** `[COLOQUE SEU LINK PÚBLICO DO WOKWI AQUI]` 
* ➡️ **Canal no ThingSpeak:** `[COLOQUE SEU LINK PÚBLICO DO CANAL THINKSPEAK AQUI]` 
* ➡️ **Vídeo de Apresentação:** `[COLOQUE SEU LINK DO VÍDEO AQUI]` 

---

### 🖼️ Circuito no Wokwi
![Circuito do projeto Vinheria Safe no Wokwi](png)

### 📈 Gráficos no ThingSpeak
*[PRINT DO THINKSPEAK ]*

### 📧 Exemplo de E-mail de Alerta
*[PRINT DO E-MAIL DE ALERTA]*

---

## 7. Autores 👨‍💻

* **Beatriz Bastos Borges** - `CB3024946`
* **Laysa Bernardes Campos da Rocha** - `CB3024873`
* **Lucas Lopes Cruz** - `CB3025284`
* **Miguel Luizatto Alves** - `CB3025039`