package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class WashingMachine {

    public WashingMachine() {
        System.out.println("The WashingMachine class created");
    }

    private int washingMachineId;
    private String washingMachineName;

    public int getWashingMachineId() {
        return washingMachineId;
    }

    public String getWashingMachineName() {
        return washingMachineName;
    }

    public void setWashingMachineId(int washingMachineId) {
        this.washingMachineId = washingMachineId;
    }

    public void setWashingMachineName(String washingMachineName) {
        this.washingMachineName = washingMachineName;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "washingMachineId=" + washingMachineId +
                ", washingMachineName='" + washingMachineName + '\'' +
                '}';
    }
}
