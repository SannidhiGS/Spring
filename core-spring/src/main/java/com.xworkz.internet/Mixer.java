package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Mixer {

    public Mixer() {
        System.out.println("The Mixer class created");
    }

    private int mixerId;
    private String mixerName;

    public int getMixerId() {
        return mixerId;
    }

    public String getMixerName() {
        return mixerName;
    }

    public void setMixerId(int mixerId) {
        this.mixerId = mixerId;
    }

    public void setMixerName(String mixerName) {
        this.mixerName = mixerName;
    }

    @Override
    public String toString() {
        return "Mixer{" +
                "mixerId=" + mixerId +
                ", mixerName='" + mixerName + '\'' +
                '}';
    }
}
