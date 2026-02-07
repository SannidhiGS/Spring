package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public Calculator() {
        System.out.println("The Calculator class created");
    }

    private int calculatorId;
    private String calculatorName;

    public int getCalculatorId() {
        return calculatorId;
    }

    public String getCalculatorName() {
        return calculatorName;
    }

    public void setCalculatorId(int calculatorId) {
        this.calculatorId = calculatorId;
    }

    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "calculatorId=" + calculatorId +
                ", calculatorName='" + calculatorName + '\'' +
                '}';
    }
}
