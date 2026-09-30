package com.smarthome.model.lock;

public class HomeKitLock implements SmartLock {
    private boolean locked = false;

    @Override
    public void lock() {
        this.locked = true;
        System.out.println("[HomeKit Lock] Дверь заблокирована с шифрованием Apple Home.");
    }

    @Override
    public void unlock() {
        this.locked = false;
        System.out.println("[HomeKit Lock] Дверь разблокирована через HomeKit.");
    }

    @Override
    public boolean isLocked() {
        return locked;
    }
}
