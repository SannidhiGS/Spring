package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Scanner {

    public Scanner() {
        System.out.println("The Scanner class created");
    }

    private int scannerId;
    private String scannerName;

    public int getScannerId() {
        return scannerId;
    }

    public String getScannerName() {
        return scannerName;
    }

    public void setScannerId(int scannerId) {
        this.scannerId = scannerId;
    }

    public void setScannerName(String scannerName) {
        this.scannerName = scannerName;
    }

    @Override
    public String toString() {
        return "Scanner{" +
                "scannerId=" + scannerId +
                ", scannerName='" + scannerName + '\'' +
                '}';
    }
}
