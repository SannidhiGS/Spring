package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Battery {

    public Battery() {
        System.out.println("The Battery class created");
    }

    private int batteryId;
    private String batteryName;

    public int getBatteryId() {
        return batteryId;
    }

    public String getBatteryName() {
        return batteryName;
    }

    public void setBatteryId(int batteryId) {
        this.batteryId = batteryId;
    }

    public void setBatteryName(String batteryName) {
        this.batteryName = batteryName;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "batteryId=" + batteryId +
                ", batteryName='" + batteryName + '\'' +
                '}';
    }
}
