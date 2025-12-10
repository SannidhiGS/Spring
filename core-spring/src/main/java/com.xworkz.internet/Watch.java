package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Watch {

    public Watch() {
        System.out.println("The Watch class created");
    }

    private int watchId;
    private String watchName;

    public int getWatchId() {
        return watchId;
    }

    public String getWatchName() {
        return watchName;
    }

    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public void setWatchName(String watchName) {
        this.watchName = watchName;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "watchId=" + watchId +
                ", watchName='" + watchName + '\'' +
                '}';
    }
}
