package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class House {
    private int houseNo;
    private String color;
    @Autowired
    private Owner owner;

    public int getHouseNo() {
        return houseNo;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseNo=" + houseNo +
                ", color='" + color + '\'' +
                ", owner=" + owner +
                '}';
    }
}
