
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class TV {
    private String name;
    @Autowired
    private Remote remote;
    public Remote getRemote(){return remote;}
    public void setName(String name){this.name=name;}
}
