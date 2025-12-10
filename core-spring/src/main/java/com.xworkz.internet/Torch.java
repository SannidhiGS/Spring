package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Torch {

    public Torch() {
        System.out.println("The Torch class created");
    }

    private int torchId;
    private String torchName;

    public int getTorchId() {
        return torchId;
    }

    public String getTorchName() {
        return torchName;
    }

    public void setTorchId(int torchId) {
        this.torchId = torchId;
    }

    public void setTorchName(String torchName) {
        this.torchName = torchName;
    }

    @Override
    public String toString() {
        return "Torch{" +
                "torchId=" + torchId +
                ", torchName='" + torchName + '\'' +
                '}';
    }
}
