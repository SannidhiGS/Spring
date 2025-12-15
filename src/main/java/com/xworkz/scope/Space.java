package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Space {
    private int spaceId;
    private String galaxyName;
    @Autowired
    private Astronaut astronaut;

    public Space() { System.out.println("Space constructor created"); }

    public int getSpaceId() { return spaceId; }
    public void setSpaceId(int spaceId) { this.spaceId = spaceId; }
    public String getGalaxyName() { return galaxyName; }
    public void setGalaxyName(String galaxyName) { this.galaxyName = galaxyName; }
    public Astronaut getAstronaut() { return astronaut; }

    @Override
    public String toString() {
        return "Space{" + "spaceId=" + spaceId + ", galaxyName='" + galaxyName + '\'' + ", astronaut=" + astronaut + '}';
    }
}