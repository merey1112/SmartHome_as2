package factory;

import com.smarthome.model.light.SmartLight;
import com.smarthome.model.light.GoogleLight;
import com.smarthome.model.thermostat.SmartThermostat;
import com.smarthome.model.thermostat.GoogleThermostat;
import com.smarthome.model.lock.SmartLock;
import com.smarthome.model.lock.GoogleLock;

public class GoogleFactory implements SmartHomeFactory {
    @Override
    public SmartLight createLight() {
        return new GoogleLight();
    }

    @Override
    public SmartThermostat createThermostat() {
        return new GoogleThermostat();
    }

    @Override
    public SmartLock createLock() {
        return new GoogleLock();
    }
}