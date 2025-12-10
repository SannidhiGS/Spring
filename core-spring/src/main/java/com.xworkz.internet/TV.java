package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class TV {

    public TV() {
        System.out.println("The TV class created");
    }

    private int tvId;
    private String tvName;

    public int getTvId() {
        return tvId;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvId(int tvId) {
        this.tvId = tvId;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    @Override
    public String toString() {
        return "TV{" +
                "tvId=" + tvId +
                ", tvName='" + tvName + '\'' +
                '}';
    }
}
