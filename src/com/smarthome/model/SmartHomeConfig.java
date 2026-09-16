package com.smarthome.model;

public class SmartHomeConfig {
    // 4 обязательных
    private String hubId;
    private String ipAddress;
    private String firmwareVersion;
    private NetworkConfig networkConfig;

    // 6 опциональных
    private boolean securitySystemEnabled;
    private boolean motionSensorsActive;
    private boolean backupBatteryInstalled;
    private boolean cloudSyncEnabled;
    private int maxConnectedDevices;
    private String emergencyPhoneNumber;

    // Огромный конструктор (Part A)
    public SmartHomeConfig(String hubId, String ipAddress, String firmwareVersion,
                           NetworkConfig networkConfig, boolean securitySystemEnabled,
                           boolean motionSensorsActive, boolean backupBatteryInstalled,
                           boolean cloudSyncEnabled, int maxConnectedDevices,
                           String emergencyPhoneNumber) {
        this.hubId = hubId;
        this.ipAddress = ipAddress;
        this.firmwareVersion = firmwareVersion;
        this.networkConfig = networkConfig;
        this.securitySystemEnabled = securitySystemEnabled;
        this.motionSensorsActive = motionSensorsActive;
        this.backupBatteryInstalled = backupBatteryInstalled;
        this.cloudSyncEnabled = cloudSyncEnabled;
        this.maxConnectedDevices = maxConnectedDevices;
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    public String getHubId() { return hubId; }
}