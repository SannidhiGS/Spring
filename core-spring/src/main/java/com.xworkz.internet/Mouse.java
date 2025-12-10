package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Mouse {

    public Mouse() {
        System.out.println("The Mouse class created");
    }

    private int mouseId;
    private String mouseName;

    public int getMouseId() {
        return mouseId;
    }

    public String getMouseName() {
        return mouseName;
    }

    public void setMouseId(int mouseId) {
        this.mouseId = mouseId;
    }

    public void setMouseName(String mouseName) {
        this.mouseName = mouseName;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "mouseId=" + mouseId +
                ", mouseName='" + mouseName + '\'' +
                '}';
    }
}
