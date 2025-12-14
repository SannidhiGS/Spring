package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bank {
    public Bank(){
        System.out.println("The constructor account created");
    }
    private int bankId;
    private String bankName;
    private String bankBranch;
    @Autowired
    private Account account;

    public Account getAccount() {
        return account;
    }

    public int getBankId() {
        return bankId;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public String getBankName() {
        return bankName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                ", bankBranch='" + bankBranch + '\'' +
                ", account=" + account +
                '}';
    }
}
