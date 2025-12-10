package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Speaker {

    public Speaker() {
        System.out.println("The Speaker class created");
    }

    private int speakerId;
    private String speakerName;

    public int getSpeakerId() {
        return speakerId;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerId(int speakerId) {
        this.speakerId = speakerId;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "speakerId=" + speakerId +
                ", speakerName='" + speakerName + '\'' +
                '}';
    }
}
