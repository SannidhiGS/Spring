
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Mosque {
    private String name;
    @Autowired
    private Imam imam;
    public Imam getImam(){return imam;}
    public void setName(String name){this.name=name;}
}
