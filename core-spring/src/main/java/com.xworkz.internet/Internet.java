package com.xworkz.internet;
import org.springframework.stereotype.Component;
@Component
public class Internet {
    public Internet(){
        System.out.println("The internet class created");
    }
    private int internetId;
    private String internetName;

    public int getInternetId() {
        return internetId;
    }
    public String getInternetName() {
        return internetName;
    }

    public void setInternetId(int internetId) {
        this.internetId = internetId;
    }

    public void setInternetName(String internetName) {
        this.internetName = internetName;
    }

    @Override
    public String toString() {
        return "Internet{" +
                "internetId=" + internetId +
                ", internetName='" + internetName + '\'' +
                '}';
    }
}
