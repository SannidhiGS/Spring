package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Mobile {

    private int mobileId;
    private String brand;

    @Autowired
    private SIM sim;

    public SIM getSim() {
        return sim;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mobile [mobileId=" + mobileId + ", brand=" + brand + "]";
    }
}
