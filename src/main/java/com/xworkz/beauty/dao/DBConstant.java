package com.xworkz.file.dao;

public enum DBConstant {
    URL("jdbc:mysql://localhost:3306/file"),
    USER("root"),
    PASSWORD("Sannidhi@123");
    String value;
    DBConstant(String value){
        this.value=value;
        System.out.println("Running the db");
    }

    public String getValue() {
        return value;
    }
}
