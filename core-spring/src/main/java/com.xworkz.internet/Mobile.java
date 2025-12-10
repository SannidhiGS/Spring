package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Mobile {

    public Mobile() {
        System.out.println("The Mobile class created");
    }

    private int mobileId;
    private String mobileName;

    public int getMobileId() {
        return mobileId;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileId=" + mobileId +
                ", mobileName='" + mobileName + '\'' +
                '}';
    }
}
