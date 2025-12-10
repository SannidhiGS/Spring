package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Refrigerator {

    public Refrigerator() {
        System.out.println("The Refrigerator class created");
    }

    private int refrigeratorId;
    private String refrigeratorName;

    public int getRefrigeratorId() {
        return refrigeratorId;
    }

    public String getRefrigeratorName() {
        return refrigeratorName;
    }

    public void setRefrigeratorId(int refrigeratorId) {
        this.refrigeratorId = refrigeratorId;
    }

    public void setRefrigeratorName(String refrigeratorName) {
        this.refrigeratorName = refrigeratorName;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "refrigeratorId=" + refrigeratorId +
                ", refrigeratorName='" + refrigeratorName + '\'' +
                '}';
    }
}
