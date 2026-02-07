package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Keyboard {

    public Keyboard() {
        System.out.println("The Keyboard class created");
    }

    private int keyboardId;
    private String keyboardName;

    public int getKeyboardId() {
        return keyboardId;
    }

    public String getKeyboardName() {
        return keyboardName;
    }

    public void setKeyboardId(int keyboardId) {
        this.keyboardId = keyboardId;
    }

    public void setKeyboardName(String keyboardName) {
        this.keyboardName = keyboardName;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardId=" + keyboardId +
                ", keyboardName='" + keyboardName + '\'' +
                '}';
    }
}
