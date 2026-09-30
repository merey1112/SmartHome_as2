package com.smarthome.model.thermostat;

public class HomeKitThermostat implements SmartThermostat {
    private double currentTemperature = 22.0;

    @Override
    public void setTargetTemperature(double temperature) {
        this.currentTemperature = temperature;
        System.out.println("[HomeKit Thermostat] Температура установлена на " + temperature + "°C через Apple HomeKit.");
    }

    @Override
    public double getTargetTemperature() {
        return currentTemperature;
    }
}