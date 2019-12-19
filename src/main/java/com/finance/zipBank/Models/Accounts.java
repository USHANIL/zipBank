package com.finance.zipBank.Models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Accounts {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;
    @ManyToOne
    private User user;
    private Double balance;
    private String type;
    @OneToMany
    private List<Transactions> transactionsList;
    private Date lastUpdated;

    public Accounts() {
    }

    public Accounts(User user, Double balance, String type, Date lastUpdated) {
        this.user = user;
        this.balance = balance;
        this.type = type;
        this.lastUpdated = lastUpdated;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
