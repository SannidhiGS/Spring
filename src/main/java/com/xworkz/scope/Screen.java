package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Screen {

    private int screenNumber;
    private String screenType;

    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    @Override
    public String toString() {
        return "Screen [screenNumber=" + screenNumber + ", screenType=" + screenType + "]";
    }
}
