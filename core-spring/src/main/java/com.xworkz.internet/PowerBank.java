package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class PowerBank {

    public PowerBank() {
        System.out.println("The PowerBank class created");
    }

    private int powerBankId;
    private String powerBankName;

    public int getPowerBankId() {
        return powerBankId;
    }

    public String getPowerBankName() {
        return powerBankName;
    }

    public void setPowerBankId(int powerBankId) {
        this.powerBankId = powerBankId;
    }

    public void setPowerBankName(String powerBankName) {
        this.powerBankName = powerBankName;
    }

    @Override
    public String toString() {
        return "PowerBank{" +
                "powerBankId=" + powerBankId +
                ", powerBankName='" + powerBankName + '\'' +
                '}';
    }
}
