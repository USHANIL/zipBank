package com.finance.zipBank.Models;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Accounts {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;
    @ManyToOne
    private Long userId;
    private Double balance;
    private String type;
    private Date lastUpdated;

    public Accounts() {
    }

    public Accounts(Long userId, Double balance, Date lastUpdated) {
        this.userId = userId;
        this.balance = balance;
        this.lastUpdated = lastUpdated;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
