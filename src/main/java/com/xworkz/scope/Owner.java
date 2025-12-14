package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Owner {
    private String ownerName;
    private int ownerAge;
    private Long phone;
    public int getOwnerAge() {
        return ownerAge;
    }

    public Long getPhone() {
        return phone;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerAge(int ownerAge) {
        this.ownerAge = ownerAge;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownerName='" + ownerName + '\'' +
                ", ownerAge=" + ownerAge +
                ", phone=" + phone +
                '}';
    }
}
