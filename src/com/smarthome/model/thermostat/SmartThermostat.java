package com.smarthome.model.thermostat;

public interface SmartThermostat {
    void setTargetTemperature(double temperature);
    double getTargetTemperature();
}