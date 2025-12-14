package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CourierOffice {

    private String name;

    @Autowired
    private DeliveryBoy deliveryboy;

    public DeliveryBoy getDeliveryBoy() {
        return deliveryboy;
    }

    public void setDeliveryBoy(DeliveryBoy deliveryboy) {
        this.deliveryboy = deliveryboy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CourierOffice [name=" + name + ", deliveryboy=" + deliveryboy + "]";
    }
}
