package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Office {
    public Office(){
        System.out.println("The office constructor is created");
    }
    private int officeId;
    private String officeName;
    private String  location;
    @Autowired
    private Employee employee;

    public String getLocation() {
        return location;
    }

    public int getOfficeId() {
        return officeId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeId=" + officeId +
                ", officeName='" + officeName + '\'' +
                ", location='" + location + '\'' +
                ", employee=" + employee +
                '}';
    }
}
