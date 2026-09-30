package com.smarthome.model.lock;

public class TuyaLock implements SmartLock {
    private boolean locked = false;

    @Override
    public void lock() {
        this.locked = true;
        System.out.println("[Tuya Lock] Дверь заблокирована через протокол Zigbee.");
    }

    @Override
    public void unlock() {
        this.locked = false;
        System.out.println("[Tuya Lock] Дверь разблокирована.");
    }

    @Override
    public boolean isLocked() {
        return locked;
    }
}