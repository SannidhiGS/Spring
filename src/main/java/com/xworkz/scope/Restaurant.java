package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Restaurant {
    private int restaurantId;
    private String restaurantName;
    @Autowired
    private Chef chef;

    public Restaurant() { System.out.println("Restaurant constructor created"); }

    public int getRestaurantId() { return restaurantId; }
    public void setRestaurantId(int restaurantId) { this.restaurantId = restaurantId; }
    public String getRestaurantName() { return restaurantName; }
    public void setRestaurantName(String restaurantName) { this.restaurantName = restaurantName; }
    public Chef getChef() { return chef; }

    @Override
    public String toString() {
        return "Restaurant{" + "restaurantId=" + restaurantId + ", restaurantName='" + restaurantName + '\'' + ", chef=" + chef + '}';
    }
}