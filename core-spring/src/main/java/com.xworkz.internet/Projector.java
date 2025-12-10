package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Projector {

    public Projector() {
        System.out.println("The Projector class created");
    }

    private int projectorId;
    private String projectorName;

    public int getProjectorId() {
        return projectorId;
    }

    public String getProjectorName() {
        return projectorName;
    }

    public void setProjectorId(int projectorId) {
        this.projectorId = projectorId;
    }

    public void setProjectorName(String projectorName) {
        this.projectorName = projectorName;
    }

    @Override
    public String toString() {
        return "Projector{" +
                "projectorId=" + projectorId +
                ", projectorName='" + projectorName + '\'' +
                '}';
    }
}
