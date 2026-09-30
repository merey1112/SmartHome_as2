package com.smarthome.model.light;

public class GoogleLight implements SmartLight {
    @Override
    public void turnOn() { System.out.println("[Google Light] Включен (Google Assistant protocol)"); }
    @Override
    public void turnOff() { System.out.println("[Google Light] Выключен"); }
    @Override
    public void setBrightness(int level) { System.out.println("[Google Light] Яркость установлена на " + level + "%"); }
}