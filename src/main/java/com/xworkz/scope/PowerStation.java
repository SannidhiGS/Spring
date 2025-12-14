package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PowerStation {

    private int stationId;
    private String location;

    @Autowired
    private Engineer engineer;

    public Engineer getEngineer() {
        return engineer;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "PowerStation [stationId=" + stationId + ", location=" + location + "]";
    }
}
