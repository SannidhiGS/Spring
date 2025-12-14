package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Machine {
    public Machine(){
        System.out.println("The machine constructor created");
    }
    private int machineId;
    private String machineName;
    private String machineType;

    public int getMachineId() {
        return machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "machineId=" + machineId +
                ", machineName='" + machineName + '\'' +
                ", machineType='" + machineType + '\'' +
                '}';
    }
}
