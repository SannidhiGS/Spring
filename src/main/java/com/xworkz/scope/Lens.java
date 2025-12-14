package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Lens {

    private String lensType;
    private int focalLength;

    public void setLensType(String lensType) {
        this.lensType = lensType;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }

    @Override
    public String toString() {
        return "Lens [lensType=" + lensType + ", focalLength=" + focalLength + "]";
    }
}
