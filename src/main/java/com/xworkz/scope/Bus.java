package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bus {
    public Bus(){
        System.out.println("The bus constructor created");
    }
    private int busId;
    private String busSource;
    private String busDestination;

    public int getBusId() {
        return busId;
    }

    public String getBusDestination() {
        return busDestination;
    }

    public String getBusSource() {
        return busSource;
    }

    public void setBusDestination(String busDestination) {
        this.busDestination = busDestination;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public void setBusSource(String busSource) {
        this.busSource = busSource;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busId=" + busId +
                ", busSource='" + busSource + '\'' +
                ", busDestination='" + busDestination + '\'' +
                '}';
    }
}
