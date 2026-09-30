package com.smarthome.model.light;

public class HomeKitLight implements SmartLight {
    @Override
    public void turnOn() { System.out.println("[HomeKit Light] Включен (Apple Home protocol)"); }
    @Override
    public void turnOff() { System.out.println("[HomeKit Light] Выключен"); }
    @Override
    public void setBrightness(int level) { System.out.println("[HomeKit Light] Яркость установлена на " + level + "%"); }
}