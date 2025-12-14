package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Camera {

    private int cameraId;
    private String brand;

    @Autowired
    private Lens lens;

    public Lens getLens() {
        return lens;
    }

    public void setCameraId(int cameraId) {
        this.cameraId = cameraId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Camera [cameraId=" + cameraId + ", brand=" + brand + "]";
    }
}
