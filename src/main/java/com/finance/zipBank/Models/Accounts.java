package com.finance.zipBank.Models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Accounts {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;
    private Long userId;
    private Double balance;
    private String type;
    @OneToMany
    private List<Transactions> transactionsList;


    public Accounts() {
    }

    public Accounts(Long userId, Double balance, String type) {
        this.userId = userId;
        this.balance = balance;
        this.type = type;
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

    public List<Transactions> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(List<Transactions> transactionsList) {
        this.transactionsList = transactionsList;
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


}