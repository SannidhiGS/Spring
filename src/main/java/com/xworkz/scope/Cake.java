package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cake {

    private String cakeName;
    private int price;

    public Cake() {
        System.out.println("Cake created");
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "cakeName='" + cakeName + '\'' +
                ", price=" + price +
                '}';
    }
}
