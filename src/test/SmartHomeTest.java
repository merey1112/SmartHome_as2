package test;

import factory.*;
import com.smarthome.model.light.*;
import com.smarthome.model.thermostat.*;
import com.smarthome.model.lock.*;
import service.SmartHomeService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartHomeTest {

    // 1-4. Тесты создания продуктов через TuyaFactory
    @Test void testTuyaLightCreation() {
        SmartHomeFactory factory = new TuyaFactory();
        assertTrue(factory.createLight() instanceof TuyaLight);
    }
    @Test void testTuyaThermostatCreation() {
        SmartHomeFactory factory = new TuyaFactory();
        assertTrue(factory.createThermostat() instanceof TuyaThermostat);
    }
    @Test void testTuyaLockCreation() {
        SmartHomeFactory factory = new TuyaFactory();
        assertTrue(factory.createLock() instanceof TuyaLock);
    }

    // 5-7. Тесты создания продуктов через HomeKitFactory
    @Test void testHomeKitLightCreation() {
        SmartHomeFactory factory = new HomeKitFactory();
        assertTrue(factory.createLight() instanceof HomeKitLight);
    }
    @Test void testHomeKitThermostatCreation() {
        SmartHomeFactory factory = new HomeKitFactory();
        assertTrue(factory.createThermostat() instanceof HomeKitThermostat);
    }
    @Test void testHomeKitLockCreation() {
        SmartHomeFactory factory = new HomeKitFactory();
        assertTrue(factory.createLock() instanceof HomeKitLock);
    }

    // 8-10. Тесты создания продуктов через GoogleFactory
    @Test void testGoogleLightCreation() {
        SmartHomeFactory factory = new GoogleFactory();
        assertTrue(factory.createLight() instanceof GoogleLight);
    }
    @Test void testGoogleThermostatCreation() {
        SmartHomeFactory factory = new GoogleFactory();
        assertTrue(factory.createThermostat() instanceof GoogleThermostat);
    }
    @Test void testGoogleLockCreation() {
        SmartHomeFactory factory = new GoogleFactory();
        assertTrue(factory.createLock() instanceof GoogleLock);
    }

    // 11-13. Тесты создания продуктов через MatterFactory
    @Test void testMatterLightCreation() {
        SmartHomeFactory factory = new MatterFactory();
        assertTrue(factory.createLight() instanceof MatterLight);
    }
    @Test void testMatterThermostatCreation() {
        SmartHomeFactory factory = new MatterFactory();
        assertTrue(factory.createThermostat() instanceof MatterThermostat);
    }
    @Test void testMatterLockCreation() {
        SmartHomeFactory factory = new MatterFactory();
        assertTrue(factory.createLock() instanceof MatterLock);
    }

    // 14. Тест бизнес-сценариев
    @Test void testServiceScenariosExecution() {
        SmartHomeFactory factory = new TuyaFactory();
        SmartHomeService service = new SmartHomeService(factory);
        assertDoesNotThrow(service::runNightScenario);
        assertDoesNotThrow(service::runEmergencyScenario);
        assertDoesNotThrow(service::runEcoScenario);
    }

    // 15. Тест метода Factory Method (LightFactory)
    @Test void testFactoryMethodExecution() {
        LightFactory factory = new TuyaLightFactory();
        assertDoesNotThrow(factory::setupEveningLighting);
    }
}