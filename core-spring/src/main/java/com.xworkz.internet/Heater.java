package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Heater {

    public Heater() {
        System.out.println("The Heater class created");
    }

    private int heaterId;
    private String heaterName;

    public int getHeaterId() {
        return heaterId;
    }

    public String getHeaterName() {
        return heaterName;
    }

    public void setHeaterId(int heaterId) {
        this.heaterId = heaterId;
    }

    public void setHeaterName(String heaterName) {
        this.heaterName = heaterName;
    }

    @Override
    public String toString() {
        return "Heater{" +
                "heaterId=" + heaterId +
                ", heaterName='" + heaterName + '\'' +
                '}';
    }
}
