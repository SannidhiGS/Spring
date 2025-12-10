package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Stove {

    public Stove() {
        System.out.println("The Stove class created");
    }

    private int stoveId;
    private String stoveName;

    public int getStoveId() {
        return stoveId;
    }

    public String getStoveName() {
        return stoveName;
    }

    public void setStoveId(int stoveId) {
        this.stoveId = stoveId;
    }

    public void setStoveName(String stoveName) {
        this.stoveName = stoveName;
    }

    @Override
    public String toString() {
        return "Stove{" +
                "stoveId=" + stoveId +
                ", stoveName='" + stoveName + '\'' +
                '}';
    }
}
