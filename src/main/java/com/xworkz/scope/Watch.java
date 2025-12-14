
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Watch {
    private String name;
    @Autowired
    private Strap strap;
    public Strap getStrap(){return strap;}
    public void setName(String name){this.name=name;}
}
