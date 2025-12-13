package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class LifeStyle {
    public LifeStyle(){
        System.out.println("The LifeStyle constructor created");
    }
    private int shopId;
    private String shopName;
    private String mallType;

    public int getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getMallType() {
        return mallType;
    }



    public void setMallType(String mallType) {
        this.mallType = mallType;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "LifeStyle{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", mallType='" + mallType + '\'' +
                '}';
    }
}
