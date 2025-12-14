
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class SuperMarket {
    private String name;
    @Autowired
    private Product product;
    public Product getProduct(){return product;}
    public void setName(String name){this.name=name;}
}
