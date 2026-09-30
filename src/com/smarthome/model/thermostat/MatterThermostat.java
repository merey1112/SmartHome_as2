package com.smarthome.model.thermostat;

public class MatterThermostat implements SmartThermostat {
    private double temp = 22.0;
    @Override
    public void setTargetTemperature(double temp) {
        this.temp = temp;
        System.out.println("[Matter Thermostat] Температура: " + temp + "°C");
    }
    @Override
    public double getTargetTemperature() { return temp; }
}
