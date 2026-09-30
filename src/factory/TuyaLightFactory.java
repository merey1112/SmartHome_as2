package factory;

import com.smarthome.model.light.SmartLight;
import com.smarthome.model.light.TuyaLight;

public class TuyaLightFactory extends LightFactory {
    @Override
    public SmartLight createLight() {
        return new TuyaLight();
    }
}