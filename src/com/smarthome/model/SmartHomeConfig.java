package com.smarthome.model;

public class SmartHomeConfig {
    private final String hubId;
    private final String ipAddress;
    private final String firmwareVersion;
    private final NetworkConfig networkConfig;

    private final boolean securitySystemEnabled;
    private final boolean motionSensorsActive;
    private final boolean backupBatteryInstalled;
    private final boolean cloudSyncEnabled;
    private final int maxConnectedDevices;
    private final String emergencyPhoneNumber;

    private SmartHomeConfig(Builder builder) {
        this.hubId = builder.hubId;
        this.ipAddress = builder.ipAddress;
        this.firmwareVersion = builder.firmwareVersion;
        this.networkConfig = builder.networkConfig;
        this.securitySystemEnabled = builder.securitySystemEnabled;
        this.motionSensorsActive = builder.motionSensorsActive;
        this.backupBatteryInstalled = builder.backupBatteryInstalled;
        this.cloudSyncEnabled = builder.cloudSyncEnabled;
        this.maxConnectedDevices = builder.maxConnectedDevices;
        this.emergencyPhoneNumber = builder.emergencyPhoneNumber;
    }

    public String getHubId() { return hubId; }
    public String getIpAddress() { return ipAddress; }
    public String getFirmwareVersion() { return firmwareVersion; }
    public NetworkConfig getNetworkConfig() { return networkConfig; }
    public boolean isSecuritySystemEnabled() { return securitySystemEnabled; }
    public boolean isMotionSensorsActive() { return motionSensorsActive; }
    public boolean isBackupBatteryInstalled() { return backupBatteryInstalled; }
    public boolean isCloudSyncEnabled() { return cloudSyncEnabled; }
    public int getMaxConnectedDevices() { return maxConnectedDevices; }
    public String getEmergencyPhoneNumber() { return emergencyPhoneNumber; }

    public static class Builder {
        private final String hubId;
        private final String ipAddress;
        private final String firmwareVersion;
        private final NetworkConfig networkConfig;

        private boolean securitySystemEnabled = false;
        private boolean motionSensorsActive = false;
        private boolean backupBatteryInstalled = false;
        private boolean cloudSyncEnabled = true;
        private int maxConnectedDevices = 10;
        private String emergencyPhoneNumber = null;

        public Builder(String hubId, String ipAddress, String firmwareVersion, NetworkConfig networkConfig) {
            this.hubId = hubId;
            this.ipAddress = ipAddress;
            this.firmwareVersion = firmwareVersion;
            this.networkConfig = networkConfig;
        }

        public Builder enableSecuritySystem() {
            this.securitySystemEnabled = true;
            return this;
        }

        public Builder enableMotionSensors() {
            this.motionSensorsActive = true;
            return this;
        }

        public Builder withBackupBattery() {
            this.backupBatteryInstalled = true;
            return this;
        }

        public Builder disableCloudSync() {
            this.cloudSyncEnabled = false;
            return this;
        }

        public Builder maxDevices(int count) {
            this.maxConnectedDevices = count;
            return this;
        }

        public Builder emergencyContact(String number) {
            this.emergencyPhoneNumber = number;
            return this;
        }

        public SmartHomeConfig build() {
            return new SmartHomeConfig(this);
        }
    }
}