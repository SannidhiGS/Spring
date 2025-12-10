package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Headphone {

    public Headphone() {
        System.out.println("The Headphone class created");
    }

    private int headphoneId;
    private String headphoneName;

    public int getHeadphoneId() {
        return headphoneId;
    }

    public String getHeadphoneName() {
        return headphoneName;
    }

    public void setHeadphoneId(int headphoneId) {
        this.headphoneId = headphoneId;
    }

    public void setHeadphoneName(String headphoneName) {
        this.headphoneName = headphoneName;
    }

    @Override
    public String toString() {
        return "Headphone{" +
                "headphoneId=" + headphoneId +
                ", headphoneName='" + headphoneName + '\'' +
                '}';
    }
}
