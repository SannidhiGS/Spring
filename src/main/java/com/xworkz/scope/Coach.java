package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Coach {
    private int coachId;
    private int noOfCoach;

    public int getNoOfCoach() {
        return noOfCoach;
    }
    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public void setNoOfCoach(int noOfCoach) {
        this.noOfCoach = noOfCoach;
    }
    @Override
    public String toString() {
        return "Coach{" +
                "coachId=" + coachId +
                ", noOfCoach=" + noOfCoach +
                '}';
    }
}
