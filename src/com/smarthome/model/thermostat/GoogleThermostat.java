package com.smarthome.model.thermostat;

public class GoogleThermostat implements SmartThermostat {
    private double currentTemperature = 22.0;

    @Override
    public void setTargetTemperature(double temperature) {
        this.currentTemperature = temperature;
        System.out.println("[Google Thermostat] Температура установлена на " + temperature + "°C через Google Nest.");
    }

    @Override
    public double getTargetTemperature() {
        return currentTemperature;
    }
}