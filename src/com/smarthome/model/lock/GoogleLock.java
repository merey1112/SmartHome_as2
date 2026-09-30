package com.smarthome.model.lock;

public class GoogleLock implements SmartLock {
    private boolean locked = false;

    @Override
    public void lock() {
        this.locked = true;
        System.out.println("[Google Lock] Дверь заблокирована через Google Assistant.");
    }

    @Override
    public void unlock() {
        this.locked = false;
        System.out.println("[Google Lock] Дверь разблокирована.");
    }

    @Override
    public boolean isLocked() {
        return locked;
    }
}