package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class AirCooler {

    public AirCooler() {
        System.out.println("The AirCooler class created");
    }

    private int airCoolerId;
    private String airCoolerName;

    public int getAirCoolerId() {
        return airCoolerId;
    }

    public String getAirCoolerName() {
        return airCoolerName;
    }

    public void setAirCoolerId(int airCoolerId) {
        this.airCoolerId = airCoolerId;
    }

    public void setAirCoolerName(String airCoolerName) {
        this.airCoolerName = airCoolerName;
    }

    @Override
    public String toString() {
        return "AirCooler{" +
                "airCoolerId=" + airCoolerId +
                ", airCoolerName='" + airCoolerName + '\'' +
                '}';
    }
}
