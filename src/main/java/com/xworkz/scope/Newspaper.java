
package com.xworkz.scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Newspaper {
    private String name;
    @Autowired
    private Editor editor;
    public Editor getEditor(){return editor;}
    public void setName(String name){this.name=name;}
}
