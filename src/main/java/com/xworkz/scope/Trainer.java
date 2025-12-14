package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Trainer {
    public Trainer(){
        System.out.println("The trainer  constructor created");
    }
    private int trainerId;
    private String trainerName;

    public int getTrainerId() {
        return trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", trainerName='" + trainerName + '\'' +
                '}';
    }
}
