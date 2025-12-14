
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class MarriageHall {
    private String name;
    @Autowired
    private Manager2 manager2;
    public Manager2 getManager2(){return manager2;}
    public void setName(String name){this.name=name;}
}
