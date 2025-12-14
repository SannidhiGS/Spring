package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Doctor {
    public Doctor(){
        System.out.println("The Doctor constructor created");
    }
    private int doctorID;
    private String doctorName;
    private String specialization;

    public int getDoctorID() {
        return doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorID=" + doctorID +
                ", doctorName='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
