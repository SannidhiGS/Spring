
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class RailwayStation {
    private String name;
    @Autowired
    private TicketCounter ticketcounter;
    public TicketCounter getTicketCounter(){return ticketcounter;}
    public void setName(String name){this.name=name;}
}
