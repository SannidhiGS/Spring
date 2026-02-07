package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Charger {

    public Charger() {
        System.out.println("The Charger class created");
    }

    private int chargerId;
    private String chargerName;

    public int getChargerId() {
        return chargerId;
    }

    public String getChargerName() {
        return chargerName;
    }

    public void setChargerId(int chargerId) {
        this.chargerId = chargerId;
    }

    public void setChargerName(String chargerName) {
        this.chargerName = chargerName;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "chargerId=" + chargerId +
                ", chargerName='" + chargerName + '\'' +
                '}';
    }
}
