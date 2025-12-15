package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class College {
    private int collegeId;
    private String collegeName;
    @Autowired
    private Student student;

    public College() { System.out.println("College constructor created"); }

    public int getCollegeId() { return collegeId; }
    public void setCollegeId(int collegeId) { this.collegeId = collegeId; }
    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }
    public Student getStudent() { return student; }

    @Override
    public String toString() {
        return "College{" + "collegeId=" + collegeId + ", collegeName='" + collegeName + '\'' + ", student=" + student + '}';
    }
}
