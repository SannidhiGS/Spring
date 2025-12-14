package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bustand {
    public Bustand(){
        System.out.println("The bus constructor created");
    }
    private int busStandId;
    private String busstandName;
    @Autowired
    private Bus bus;

    public Bus getBus() {
        return bus;
    }

    public int getBusStandId() {
        return busStandId;
    }

    public String getBusstandName() {
        return busstandName;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void setBusStandId(int busStandId) {
        this.busStandId = busStandId;
    }
    public void setBusstandName(String busstandName) {
        this.busstandName = busstandName;
    }

    @Override
    public String toString() {
        return "Bustand{" +
                "busStandId=" + busStandId +
                ", busstandName='" + busstandName + '\'' +
                ", bus=" + bus +
                '}';
    }
}
