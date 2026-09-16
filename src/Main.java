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

        System.out.println("Хаб успешно создан через Builder! ID: " + config.getHubId());

        // Добавляем тест перехвата ошибок валидации
        try {
            SmartHomeConfig invalidConfig = new SmartHomeConfig.Builder("", "192.168.1.1", "v1.0", net)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Валидация перехвачена: " + e.getMessage());
        }
    }
}
