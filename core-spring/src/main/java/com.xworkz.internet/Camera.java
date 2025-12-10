package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Camera {

    public Camera() {
        System.out.println("The Camera class created");
    }

    private int cameraId;
    private String cameraName;

    public int getCameraId() {
        return cameraId;
    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraId(int cameraId) {
        this.cameraId = cameraId;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "cameraId=" + cameraId +
                ", cameraName='" + cameraName + '\'' +
                '}';
    }
}
