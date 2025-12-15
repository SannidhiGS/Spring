
package com.xworkz.scope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Student {
    private String value;
    public void setValue(String value){
        this.value=value;
    }

    public void setStudentName(String suresh) {
    }

    public void setStudentId(int i) {
    }
}
