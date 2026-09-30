package factory;

import com.smarthome.model.light.*;
import com.smarthome.model.thermostat.*;
import com.smarthome.model.lock.*;

public class HomeKitFactory implements SmartHomeFactory {
    @Override public SmartLight createLight() { return new HomeKitLight(); }
    @Override public SmartThermostat createThermostat() { return new HomeKitThermostat(); }
    @Override public SmartLock createLock() { return new HomeKitLock(); }
}