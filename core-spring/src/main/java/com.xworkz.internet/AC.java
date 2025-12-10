package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class AC {

    public AC() {
        System.out.println("The AC class created");
    }

    private int acId;
    private String acName;

    public int getAcId() {
        return acId;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcId(int acId) {
        this.acId = acId;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    @Override
    public String toString() {
        return "AC{" +
                "acId=" + acId +
                ", acName='" + acName + '\'' +
                '}';
    }
}
