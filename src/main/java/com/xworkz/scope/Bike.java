package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bike {

    private int bikeId;
    private String bikeName;

    @Autowired
    private Helmet helmet;

    public Helmet getHelmet() {
        return helmet;
    }

    public void setBikeId(int bikeId) {
        this.bikeId = bikeId;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    @Override
    public String toString() {
        return "Bike [bikeId=" + bikeId + ", bikeName=" + bikeName + "]";
    }
}
