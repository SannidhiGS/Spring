
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Temple {
    private String name;
    @Autowired
    private Priest priest;
    public Priest getPriest(){return priest;}
    public void setName(String name){this.name=name;}
}
