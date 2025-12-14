package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Helmet {

    private String helmetBrand;
    private String helmetSize;

    public void setHelmetBrand(String helmetBrand) {
        this.helmetBrand = helmetBrand;
    }

    public void setHelmetSize(String helmetSize) {
        this.helmetSize = helmetSize;
    }

    @Override
    public String toString() {
        return "Helmet [helmetBrand=" + helmetBrand + ", helmetSize=" + helmetSize + "]";
    }
}
