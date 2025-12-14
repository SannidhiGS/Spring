package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BusDepot {

    private String name;

    @Autowired
    private Driver driver;

    // Getter for driver
    public Driver getDriver() {
        return driver;
    }

    // Optional setter for driver if needed
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BusDepot [name=" + name + ", driver=" + driver + "]";
    }
}
