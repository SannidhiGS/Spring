package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Park {
    private int parkId;
    private String parkName;
    @Autowired
    private Tree tree;

    public Park() { System.out.println("Park constructor created"); }

    public int getParkId() { return parkId; }
    public void setParkId(int parkId) { this.parkId = parkId; }
    public String getParkName() { return parkName; }
    public void setParkName(String parkName) { this.parkName = parkName; }
    public Tree getTree() { return tree; }

    @Override
    public String toString() {
        return "Park{" + "parkId=" + parkId + ", parkName='" + parkName + '\'' + ", tree=" + tree + '}';
    }
}