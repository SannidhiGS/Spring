
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Parking {
    private String name;
    @Autowired
    private Security security;
    public Security getSecurity(){return security;}
    public void setName(String name){this.name=name;}
}
