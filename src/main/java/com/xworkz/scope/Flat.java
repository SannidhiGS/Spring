package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Flat {
    private int flatNo;
    private String ownerName;

    public Flat() { System.out.println("Flat constructor created"); }

    public int getFlatNo() { return flatNo; }
    public void setFlatNo(int flatNo) { this.flatNo = flatNo; }
    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    @Override
    public String toString() {
        return "Flat{" + "flatNo=" + flatNo + ", ownerName='" + ownerName + '\'' + '}';
    }
}
