package com.smarthome.model.lock;

public interface SmartLock {
    void lock();
    void unlock();
    boolean isLocked();
}
