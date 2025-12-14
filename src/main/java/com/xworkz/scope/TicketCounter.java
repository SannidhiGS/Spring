
package com.xworkz.scope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class TicketCounter {
    private String value;
    public void setValue(String value){this.value=value;}
}
