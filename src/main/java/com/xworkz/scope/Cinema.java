package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cinema {

    private int cinemaId;
    private String cinemaName;

    @Autowired
    private Screen screen;

    public Screen getScreen() {
        return screen;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    @Override
    public String toString() {
        return "Cinema [cinemaId=" + cinemaId + ", cinemaName=" + cinemaName + "]";
    }
}
