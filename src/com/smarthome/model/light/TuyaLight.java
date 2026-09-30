package com.smarthome.model.light;

public class TuyaLight implements SmartLight {
    @Override
    public void turnOn() { System.out.println("[Tuya Light] Включен (Zigbee protocol)"); }
    @Override
    public void turnOff() { System.out.println("[Tuya Light] Выключен"); }
    @Override
    public void setBrightness(int level) { System.out.println("[Tuya Light] Яркость установлена на " + level + "%"); }
}