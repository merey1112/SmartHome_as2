package com.smarthome;

import com.smarthome.model.NetworkConfig;
import com.smarthome.model.SmartHomeConfig;

public class Main {
    public static void main(String[] args) {
        NetworkConfig net = new NetworkConfig("Home_WiFi", "5GHz");

        SmartHomeConfig config = new SmartHomeConfig.Builder("HUB-001", "192.168.1.1", "v1.0", net)
                .enableSecuritySystem()
                .withBackupBattery()
                .emergencyContact("+77071234567")
                .maxDevices(32)
                .build();

        System.out.println("Успешный запуск! Хаб ID: " + config.getHubId());
        System.out.println("IP адрес: " + config.getIpAddress());

        try {
            SmartHomeConfig invalidConfig = new SmartHomeConfig.Builder("", "192.168.1.1", "v1.0", net)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка валидации успешно обработана: " + e.getMessage());
        }
    }
}
