package factory;

import com.smarthome.model.light.SmartLight;
import com.smarthome.model.thermostat.SmartThermostat;
import com.smarthome.model.lock.SmartLock;

public interface SmartHomeFactory {
    SmartLight createLight();
    SmartThermostat createThermostat();
    SmartLock createLock();
}