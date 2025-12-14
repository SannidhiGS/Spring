package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Stadium {

    private int stadiumId;
    private String stadiumName;

    @Autowired
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setStadiumId(int stadiumId) {
        this.stadiumId = stadiumId;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    @Override
    public String toString() {
        return "Stadium [stadiumId=" + stadiumId + ", stadiumName=" + stadiumName + "]";
    }
}
