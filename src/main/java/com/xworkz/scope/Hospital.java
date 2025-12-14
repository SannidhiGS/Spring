package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Hospital {
    public Hospital(){
        System.out.println("The hospital constructor created");
    }
    private int hospitalId;
    private String hospitalName;
    private String hospitalLocation;
    @Autowired
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalLocation='" + hospitalLocation + '\'' +
                ", doctor=" + doctor +
                '}';
    }
}
