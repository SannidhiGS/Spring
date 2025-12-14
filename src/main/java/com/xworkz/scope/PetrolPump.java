
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class PetrolPump {
    private String name;
    @Autowired
    private Nozzle nozzle;
    public Nozzle getNozzle(){return nozzle;}
    public void setName(String name){this.name=name;}
}
