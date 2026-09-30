package com.smarthome.model.thermostat;

public class TuyaThermostat implements SmartThermostat {
    private double currentTemperature = 22.0;

    @Override
    public void setTargetTemperature(double temperature) {
        this.currentTemperature = temperature;
        System.out.println("[Tuya Thermostat] Температура установлена на " + temperature + "°C по протоколу Zigbee.");
    }

    @Override
    public double getTargetTemperature() {
        return currentTemperature;
    }
}