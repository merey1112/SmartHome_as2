package com.smarthome.model.light;

public interface SmartLight {
    void turnOn();
    void turnOff();
    void setBrightness(int level);
}