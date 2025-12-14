package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Aquarium {

    private int aquariumId;
    private String aquariumName;

    @Autowired
    private Fish fish;

    public Aquarium() {
        System.out.println("Aquarium created");
    }

    public Fish getFish() {
        return fish;
    }

    public int getAquariumId() {
        return aquariumId;
    }

    public void setAquariumId(int aquariumId) {
        this.aquariumId = aquariumId;
    }

    public String getAquariumName() {
        return aquariumName;
    }

    public void setAquariumName(String aquariumName) {
        this.aquariumName = aquariumName;
    }

    @Override
    public String toString() {
        return "Aquarium{" +
                "aquariumId=" + aquariumId +
                ", aquariumName='" + aquariumName + '\'' +
                '}';
    }
}
