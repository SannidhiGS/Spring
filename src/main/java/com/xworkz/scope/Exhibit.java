package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Exhibit {
    private int exhibitId;
    private String exhibitName;

    public Exhibit() { System.out.println("Exhibit constructor created"); }

    public int getExhibitId() { return exhibitId; }
    public void setExhibitId(int exhibitId) { this.exhibitId = exhibitId; }
    public String getExhibitName() { return exhibitName; }
    public void setExhibitName(String exhibitName) { this.exhibitName = exhibitName; }

    @Override
    public String toString() {
        return "Exhibit{" + "exhibitId=" + exhibitId + ", exhibitName='" + exhibitName + '\'' + '}';
    }
}
