
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class MusicSystem {
    private String name;
    @Autowired
    private Speaker speaker;
    public Speaker getSpeaker(){return speaker;}
    public void setName(String name){this.name=name;}
}
