package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engineer {

    private int engineerId;
    private String engineerName;

    public void setEngineerId(int engineerId) {
        this.engineerId = engineerId;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    @Override
    public String toString() {
        return "Engineer [engineerId=" + engineerId + ", engineerName=" + engineerName + "]";
    }
}
