package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class University {

    private String name;
    private int universityId;

    @Autowired
    private Professor professor;

    // Getter for professor
    public Professor getProfessor() {
        return professor;
    }

    // Setter for university name
    public void setUniversityName(String name) {
        this.name = name;
    }

    // Getter for university name
    public String getUniversityName() {
        return name;
    }

    // Setter for university id
    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    // Getter for university id
    public int getUniversityId() {
        return universityId;
    }

    @Override
    public String toString() {
        return "University [id=" + universityId + ", name=" + name + ", professor=" + professor + "]";
    }
}
