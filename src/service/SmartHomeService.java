package service;

import factory.SmartHomeFactory;
import com.smarthome.model.light.SmartLight;
import com.smarthome.model.thermostat.SmartThermostat;
import com.smarthome.model.lock.SmartLock;

public class SmartHomeService {
    private final SmartLight light;
    private final SmartThermostat thermostat;
    private final SmartLock lock;

    public SmartHomeService(SmartHomeFactory factory) {
        this.light = factory.createLight();
        this.thermostat = factory.createThermostat();
        this.lock = factory.createLock();
    }

    // Сценарий 1: "Ночной режим"
    public void runNightScenario() {
        System.out.println("--- Сценарий 'Ночь' ---");
        lock.lock();
        thermostat.setTargetTemperature(18.0);
        light.turnOff();
    }

    // Сценарий 2: "Тревога"
    public void runEmergencyScenario() {
        System.out.println("--- Сценарий 'ТРЕВОГА' ---");
        lock.unlock();
        light.setBrightness(100);
        light.turnOn();
    }

    // Сценарий 3: "Эко-режим"
    public void runEcoScenario() {
        System.out.println("--- Сценарий 'Эко-режим' ---");
        thermostat.setTargetTemperature(20.0);
        light.setBrightness(20);
    }
}