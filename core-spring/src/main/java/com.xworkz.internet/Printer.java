package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Printer {

    public Printer() {
        System.out.println("The Printer class created");
    }

    private int printerId;
    private String printerName;

    public int getPrinterId() {
        return printerId;
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterId(int printerId) {
        this.printerId = printerId;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "printerId=" + printerId +
                ", printerName='" + printerName + '\'' +
                '}';
    }
}
