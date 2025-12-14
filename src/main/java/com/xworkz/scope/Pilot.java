package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pilot {
    public Pilot(){
        System.out.println("The Pilot constructor created");
    }
    private int pilotId;
    private String pilotName;
    private int yearOfExperience;

    public int getPilotId() {
        return pilotId;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotId(int pilotId) {
        this.pilotId = pilotId;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }
}
