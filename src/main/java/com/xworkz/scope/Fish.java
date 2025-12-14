package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Fish {

    private String fishName;
    private int fishAge;

    public Fish() {
        System.out.println("Fish created");
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public int getFishAge() {
        return fishAge;
    }

    public void setFishAge(int fishAge) {
        this.fishAge = fishAge;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fishName='" + fishName + '\'' +
                ", fishAge=" + fishAge +
                '}';
    }
}
