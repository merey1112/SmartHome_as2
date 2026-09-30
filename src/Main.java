import factory.*;
import service.SmartHomeService;

public class Main {
    public static void main(String[] args) {
        // Динамический выбор фабрики (Part E)
        String ecosystemConfig = "HomeKit"; // Можно менять на "Tuya" или "Google"

        SmartHomeFactory factory;

        switch (ecosystemConfig.toLowerCase()) {
            case "tuya" -> factory = new TuyaFactory();
            case "homekit" -> factory = new HomeKitFactory();
            case "google" -> factory = new GoogleFactory();
            default -> throw new IllegalArgumentException("Неизвестная платформа: " + ecosystemConfig);
        }

        SmartHomeService service = new SmartHomeService(factory);
        service.runNightScenario();
        service.runEcoScenario();
    }
}