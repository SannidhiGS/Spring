package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Zoo {

    private int zooId;
    private String zooName;

    @Autowired
    private Animal animal;

    public Zoo() {
        System.out.println("Zoo created");
    }

    public Animal getAnimal() {
        return animal;
    }

    public int getZooId() {
        return zooId;
    }

    public void setZooId(int zooId) {
        this.zooId = zooId;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "zooId=" + zooId +
                ", zooName='" + zooName + '\'' +
                '}';
    }
}
