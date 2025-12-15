package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Chef {
    private int chefId;
    private String chefName;

    public Chef() { System.out.println("Chef constructor created"); }

    public int getChefId() { return chefId; }
    public void setChefId(int chefId) { this.chefId = chefId; }
    public String getChefName() { return chefName; }
    public void setChefName(String chefName) { this.chefName = chefName; }

    @Override
    public String toString() {
        return "Chef{" + "chefId=" + chefId + ", chefName='" + chefName + '\'' + '}';
    }
}
