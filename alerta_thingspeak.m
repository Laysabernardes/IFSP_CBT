% === CONFIGURAÇÕES ===
channelID = 3000536;
read_api_key = 'J2Z8BHSK3JBW4W97';
alert_api_key = 'TAKScy9NfV/or9LpGx0';
alert_url = 'https://api.thingspeak.com/alerts/send';

% === Limites ===
TEMP_IDEAL_MIN = 10.0;
TEMP_IDEAL_MAX = 15.0;

UMID_IDEAL_MIN = 50.0;
UMID_IDEAL_MAX = 70.0;

LUZ_MIN = 60;
LUZ_MAX = 280;

% === Leitura dos dados ===
temperatureData = thingSpeakRead(channelID, 'Fields', 1, 'NumPoints', 1, 'ReadKey', read_api_key);
humidityData    = thingSpeakRead(channelID, 'Fields', 2, 'NumPoints', 1, 'ReadKey', read_api_key);
lightData       = thingSpeakRead(channelID, 'Fields', 3, 'NumPoints', 1, 'ReadKey', read_api_key);

% === Verificações ===
alertas = "";

% Temperatura
if temperatureData > TEMP_IDEAL_MAX
    alertas = alertas + sprintf("Temperatura ALTA: %.2f°C (limite: %.2f°C)\n", temperatureData, TEMP_IDEAL_MAX);
elseif temperatureData < TEMP_IDEAL_MIN
    alertas = alertas + sprintf("Temperatura BAIXA: %.2f°C (limite: %.2f°C)\n", temperatureData, TEMP_IDEAL_MIN);
end

% Umidade
if humidityData > UMID_IDEAL_MAX
    alertas = alertas + sprintf("Umidade ALTA: %.2f%% (limite: %.2f%%)\n", humidityData, UMID_IDEAL_MAX);
elseif humidityData < UMID_IDEAL_MIN
    alertas = alertas + sprintf("Umidade BAIXA: %.2f%% (limite: %.2f%%)\n", humidityData, UMID_IDEAL_MIN);
end

% Luminosidade
if lightData > LUZ_MAX
    alertas = alertas + sprintf("Luminosidade ALTA: %.2f lx (limite: %.2f lx)\n", lightData, LUZ_MAX);
elseif lightData < LUZ_MIN
    alertas = alertas + sprintf("Luminosidade BAIXA: %.2f lx (limite: %.2f lx)\n", lightData, LUZ_MIN);
end

% === Envio de alerta se houver problemas ===
if ~isempty(alertas)
    alert_subject = 'Alerta: Condições Irregulares na Vinheria';
    alert_body = alertas;

    % Escapar aspas e barras
    alert_subject = strrep(alert_subject, '"', '\"');
    alert_body = strrep(alert_body, '"', '\"');
    alert_body = strrep(alert_body, '\', '\\');
    alert_body = strrep(alert_body, sprintf('\n'), ' - ');  % evitar \n

    jsonmessage = sprintf('{"subject":"%s", "body":"%s"}', alert_subject, alert_body);

    options = weboptions('HeaderFields', {
        'Thingspeak-Alerts-API-Key', alert_api_key;
        'Content-Type', 'application/json'
    });

    response = webwrite(alert_url, jsonmessage, options);
end