package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Oven {

    public Oven() {
        System.out.println("The Oven class created");
    }

    private int ovenId;
    private String ovenName;

    public int getOvenId() {
        return ovenId;
    }

    public String getOvenName() {
        return ovenName;
    }

    public void setOvenId(int ovenId) {
        this.ovenId = ovenId;
    }

    public void setOvenName(String ovenName) {
        this.ovenName = ovenName;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "ovenId=" + ovenId +
                ", ovenName='" + ovenName + '\'' +
                '}';
    }
}
