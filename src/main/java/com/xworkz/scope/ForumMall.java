package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ForumMall {
    public ForumMall(){
        System.out.println("The ForumMall constructor created");
    }
    private int mallID;
    private String mallLocation;
    private String mallName;
    @Autowired
    private LifeStyle lifeStyle;
    public int getMallID() {
        return mallID;
    }

    public String getMallLocation() {
        return mallLocation;
    }

    public String getMallName() {
        return mallName;
    }
    public LifeStyle getLifeStyle() {
        return lifeStyle;
    }

    public void setMallID(int mallID) {
        this.mallID = mallID;
    }

    public void setMallLocation(String mallLocation) {
        this.mallLocation = mallLocation;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public void setLifeStyle(LifeStyle lifeStyle) {
        this.lifeStyle = lifeStyle;
    }

    @Override
    public String toString() {
        return "ForumMall{" +
                "mallID=" + mallID +
                ", mallLocation='" + mallLocation + '\'' +
                ", mallName='" + mallName + '\'' +
                ", lifeStyle=" + lifeStyle +
                '}';
    }
}
