package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dish {
    public Dish(){
        System.out.println("The Dish constructor created");
    }
    private int dishId;
    private String dishName;
    private  float dishPrice;

    public int getDishId() {
        return dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public float getDishPrice() {
        return dishPrice;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setDishPrice(float dishPrice) {
        this.dishPrice = dishPrice;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishId=" + dishId +
                ", dishName='" + dishName + '\'' +
                ", dishPrice=" + dishPrice +
                '}';
    }
}
