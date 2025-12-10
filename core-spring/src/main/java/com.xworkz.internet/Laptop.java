package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public Laptop() {
        System.out.println("The Laptop class created");
    }

    private int laptopId;
    private String laptopName;

    public int getLaptopId() {
        return laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", laptopName='" + laptopName + '\'' +
                '}';
    }
}
