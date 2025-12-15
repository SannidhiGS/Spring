package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Astronaut {
    private int astronautId;
    private String astronautName;

    public Astronaut() { System.out.println("Astronaut constructor created"); }

    public int getAstronautId() { return astronautId; }
    public void setAstronautId(int astronautId) { this.astronautId = astronautId; }
    public String getAstronautName() { return astronautName; }
    public void setAstronautName(String astronautName) { this.astronautName = astronautName; }

    @Override
    public String toString() {
        return "Astronaut{" + "astronautId=" + astronautId + ", astronautName='" + astronautName + '\'' + '}';
    }
}