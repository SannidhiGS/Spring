
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class PoliceStation {
    private String name;
    @Autowired
    private Inspector inspector;
    public Inspector getInspector(){return inspector;}
    public void setName(String name){this.name=name;}
}
