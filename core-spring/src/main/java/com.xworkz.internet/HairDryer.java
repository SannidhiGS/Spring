package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class HairDryer {

    public HairDryer() {
        System.out.println("The HairDryer class created");
    }

    private int hairDryerId;
    private String hairDryerName;

    public int getHairDryerId() {
        return hairDryerId;
    }

    public String getHairDryerName() {
        return hairDryerName;
    }

    public void setHairDryerId(int hairDryerId) {
        this.hairDryerId = hairDryerId;
    }

    public void setHairDryerName(String hairDryerName) {
        this.hairDryerName = hairDryerName;
    }

    @Override
    public String toString() {
        return "HairDryer{" +
                "hairDryerId=" + hairDryerId +
                ", hairDryerName='" + hairDryerName + '\'' +
                '}';
    }
}
