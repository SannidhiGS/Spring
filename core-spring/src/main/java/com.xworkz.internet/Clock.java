package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Clock {

    public Clock() {
        System.out.println("The Clock class created");
    }

    private int clockId;
    private String clockName;

    public int getClockId() {
        return clockId;
    }

    public String getClockName() {
        return clockName;
    }

    public void setClockId(int clockId) {
        this.clockId = clockId;
    }

    public void setClockName(String clockName) {
        this.clockName = clockName;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "clockId=" + clockId +
                ", clockName='" + clockName + '\'' +
                '}';
    }
}
