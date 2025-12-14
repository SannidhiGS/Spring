
package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Church {

    private String name;

    @Autowired
    private Pastor pastor;

    // Getter for Pastor
    public Pastor getPastor() {
        return pastor;
    }

    // Optional setter for Pastor
    public void setPastor(Pastor pastor) {
        this.pastor = pastor;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Church [name=" + name + ", pastor=" + pastor + "]";
    }
}
