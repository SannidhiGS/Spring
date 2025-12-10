package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Fan {

    public Fan() {
        System.out.println("The Fan class created");
    }

    private int fanId;
    private String fanName;

    public int getFanId() {
        return fanId;
    }

    public String getFanName() {
        return fanName;
    }

    public void setFanId(int fanId) {
        this.fanId = fanId;
    }

    public void setFanName(String fanName) {
        this.fanName = fanName;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "fanId=" + fanId +
                ", fanName='" + fanName + '\'' +
                '}';
    }
}
