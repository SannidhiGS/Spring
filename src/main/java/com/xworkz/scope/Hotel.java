package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Hotel {
    private int hotelId;
    private String hotelName;
    private String location;
    @Autowired
    private Dish dish;

    public int getHotelId() {
        return hotelId;
    }

    public String getLocation() {
        return location;
    }

    public String getHotelName() {
        return hotelName;
    }

    public Dish getDish() {
        return dish;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", location='" + location + '\'' +
                ", dish=" + dish +
                '}';
    }
}
