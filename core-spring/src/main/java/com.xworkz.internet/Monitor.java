package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Monitor {

    public Monitor() {
        System.out.println("The Monitor class created");
    }

    private int monitorId;
    private String monitorName;

    public int getMonitorId() {
        return monitorId;
    }

    public String getMonitorName() {
        return monitorName;
    }

    public void setMonitorId(int monitorId) {
        this.monitorId = monitorId;
    }

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "monitorId=" + monitorId +
                ", monitorName='" + monitorName + '\'' +
                '}';
    }
}
