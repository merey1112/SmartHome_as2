package com.smarthome.model;

public class NetworkConfig {
    private String ssid;
    private String frequency;

    public NetworkConfig(String ssid, String frequency) {
        this.ssid = ssid;
        this.frequency = frequency;
    }

    public String getSsid() { return ssid; }
    public String getFrequency() { return frequency; }
}