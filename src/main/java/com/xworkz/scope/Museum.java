package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Museum {
    private int museumId;
    private String museumName;
    @Autowired
    private Exhibit exhibit;

    public Museum() { System.out.println("Museum constructor created"); }

    public int getMuseumId() { return museumId; }
    public void setMuseumId(int museumId) { this.museumId = museumId; }
    public String getMuseumName() { return museumName; }
    public void setMuseumName(String museumName) { this.museumName = museumName; }
    public Exhibit getExhibit() { return exhibit; }

    @Override
    public String toString() {
        return "Museum{" + "museumId=" + museumId + ", museumName='" + museumName + '\'' + ", exhibit=" + exhibit + '}';
    }
}
