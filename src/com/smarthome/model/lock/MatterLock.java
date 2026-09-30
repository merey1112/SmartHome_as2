package com.smarthome.model.lock;

public class MatterLock implements SmartLock {
    private boolean locked = false;
    @Override
    public void lock() { locked = true; System.out.println("[Matter Lock] Заблокировано"); }
    @Override
    public void unlock() { locked = false; System.out.println("[Matter Lock] Разблокировано"); }
    @Override
    public boolean isLocked() { return locked; }
}