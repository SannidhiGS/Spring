package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Factory {
    public Factory(){
        System.out.println("The public constructor created");
    }
    private int factoryId;
    private  String factoryName;
    private  String factoryLocation;
    @Autowired
    private Machine machine;

    public int getFactoryId() {
        return factoryId;
    }

    public Machine getMachine() {
        return machine;
    }

    public String getFactoryLocation() {
        return factoryLocation;
    }

    public String getFactoryName() {
        return factoryName;
    }


    public void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    public void setFactoryLocation(String factoryLocation) {
        this.factoryLocation = factoryLocation;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }
}
