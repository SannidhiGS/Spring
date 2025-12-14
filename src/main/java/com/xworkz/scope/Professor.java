
package com.xworkz.scope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Professor {
    private String value;
    private int professorId;
    private String ProfessorName;
    public void setValue(String value){this.value=value;}

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return ProfessorName;
    }

    public void setProfessorName(String professorName) {
        ProfessorName = professorName;
    }

    public int getProfessorId() {
        return professorId;
    }
}
