package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Battery {

    private int capacity;
    private String type;

    public Battery() {
        System.out.println("Battery created");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
