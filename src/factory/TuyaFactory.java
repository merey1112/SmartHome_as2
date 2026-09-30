package factory;

import com.smarthome.model.light.*;
import com.smarthome.model.thermostat.*;
import com.smarthome.model.lock.*;

public class TuyaFactory implements SmartHomeFactory {
    @Override public SmartLight createLight() { return new TuyaLight(); }
    @Override public SmartThermostat createThermostat() { return new TuyaThermostat(); }
    @Override public SmartLock createLock() { return new TuyaLock(); }
}