package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Plane {
    public Plane(){
        System.out.println("The Plane constructor created");
    }
    private int PlaneId;
    private String planeSource;
    private String planeDestination;
    @Autowired
    private Pilot pilot;

    public String getPlaneDestination() {
        return planeDestination;
    }

    public int getPlaneId() {
        return PlaneId;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public String getPlaneSource() {
        return planeSource;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public void setPlaneDestination(String planeDestination) {
        this.planeDestination = planeDestination;
    }

    public void setPlaneId(int planeId) {
        PlaneId = planeId;
    }

    public void setPlaneSource(String planeSource) {
        this.planeSource = planeSource;
    }
}
