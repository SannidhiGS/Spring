package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class IronBox {

    public IronBox() {
        System.out.println("The IronBox class created");
    }

    private int ironBoxId;
    private String ironBoxName;

    public int getIronBoxId() {
        return ironBoxId;
    }

    public String getIronBoxName() {
        return ironBoxName;
    }

    public void setIronBoxId(int ironBoxId) {
        this.ironBoxId = ironBoxId;
    }

    public void setIronBoxName(String ironBoxName) {
        this.ironBoxName = ironBoxName;
    }

    @Override
    public String toString() {
        return "IronBox{" +
                "ironBoxId=" + ironBoxId +
                ", ironBoxName='" + ironBoxName + '\'' +
                '}';
    }
}
