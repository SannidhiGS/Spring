package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Apartment {
    private int apartmentId;
    private String apartmentName;
    @Autowired
    private Flat flat;

    public Apartment() { System.out.println("Apartment constructor created"); }

    public int getApartmentId() { return apartmentId; }
    public void setApartmentId(int apartmentId) { this.apartmentId = apartmentId; }
    public String getApartmentName() { return apartmentName; }
    public void setApartmentName(String apartmentName) { this.apartmentName = apartmentName; }
    public Flat getFlat() { return flat; }

    @Override
    public String toString() {
        return "Apartment{" + "apartmentId=" + apartmentId + ", apartmentName='" + apartmentName + '\'' + ", flat=" + flat + '}';
    }
}