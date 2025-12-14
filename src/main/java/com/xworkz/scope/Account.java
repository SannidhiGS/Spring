package com.xworkz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Account {
    public Account(){
        System.out.println("The Account constructor created");
    }
    private int accountNo;
    private Float accountBalance;
    private String accountType;

    public int getAccountNo() {
        return accountNo;
    }

    public Float getAccountBalance() {
        return accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountBalance=" + accountBalance +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
