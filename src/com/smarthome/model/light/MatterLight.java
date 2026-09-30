package com.smarthome.model.light;

public class MatterLight implements SmartLight {
    @Override
    public void turnOn() { System.out.println("[Matter Light] Включен по стандарту Matter"); }
    @Override
    public void turnOff() { System.out.println("[Matter Light] Выключен"); }
    @Override
    public void setBrightness(int level) { System.out.println("[Matter Light] Яркость: " + level + "%"); }
}