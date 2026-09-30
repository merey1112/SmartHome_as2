package factory;

import com.smarthome.model.light.SmartLight;

public abstract class LightFactory {
    // Factory Method
    public abstract SmartLight createLight();

    // Бизнес-логика, работающая с созданным продуктом
    public void setupEveningLighting() {
        SmartLight light = createLight();
        System.out.println("[LightFactory] Автоматическая настройка вечернего света:");
        light.turnOn();
        light.setBrightness(30);
    }
}