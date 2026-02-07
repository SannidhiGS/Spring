package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component
public class Remote {

    public Remote() {
        System.out.println("The Remote class created");
    }

    private int remoteId;
    private String remoteName;

    public int getRemoteId() {
        return remoteId;
    }

    public String getRemoteName() {
        return remoteName;
    }

    public void setRemoteId(int remoteId) {
        this.remoteId = remoteId;
    }

    public void setRemoteName(String remoteName) {
        this.remoteName = remoteName;
    }

    @Override
    public String toString() {
        return "Remote{" +
                "remoteId=" + remoteId +
                ", remoteName='" + remoteName + '\'' +
                '}';
    }
}
