package factory;

import com.smarthome.model.light.*;
import com.smarthome.model.thermostat.*;
import com.smarthome.model.lock.*;

public class MatterFactory implements SmartHomeFactory {
    @Override public SmartLight createLight() { return new MatterLight(); }
    @Override public SmartThermostat createThermostat() { return new MatterThermostat(); }
    @Override public SmartLock createLock() { return new MatterLock(); }
}