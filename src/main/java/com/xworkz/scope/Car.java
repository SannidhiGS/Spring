package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {

    private String name;

    @Autowired
    private Engine engine;

    // Getter for Engine
    public Engine getEngine() {
        return engine;
    }

    // Optional setter for Engine
    public void setEngine(Engine engine) {
        this.engine = engine;
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
        return "Car [name=" + name + ", engine=" + engine + "]";
    }
}
