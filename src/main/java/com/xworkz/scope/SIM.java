package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SIM {

    private long simNumber;
    private String provider;

    public void setSimNumber(long simNumber) {
        this.simNumber = simNumber;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "SIM [simNumber=" + simNumber + ", provider=" + provider + "]";
    }
}
