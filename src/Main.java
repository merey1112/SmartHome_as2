package com.smarthome;

import com.smarthome.model.NetworkConfig;
import com.smarthome.model.SmartHomeConfig;

public class Main {
    public static void main(String[] args) {
        NetworkConfig net = new NetworkConfig("Home_WiFi", "5GHz");

        // Сложно понять, какой boolean за что отвечает
        SmartHomeConfig config = new SmartHomeConfig(
                "HUB-001", "192.168.1.1", "v1.0", net,
                true, true, false, true, 50, "+77071234567"
        );

        System.out.println("Хаб создан через конструктор: " + config.getHubId());
    }
}
