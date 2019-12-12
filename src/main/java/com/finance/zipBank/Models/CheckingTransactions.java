package com.finance.zipBank.Models;

import com.finance.zipBank.Service.CheckingTransactionService;

import javax.persistence.Id;

public class CheckingTransactions  {
    @Id
    private Long transaction_Id;
    private Long account_Id;
    private Long from_Account;
    private Long to_Account;
    private String transaction_Type;
    private String transaction_Description;
    private Double amount;

    public Long getTransaction_Id() {
        return transaction_Id;
    }

    public void setTransaction_Id(Long transaction_Id) {
        this.transaction_Id = transaction_Id;
    }

    public Long getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Id(Long account_Id) {
        this.account_Id = account_Id;
    }

    public Long getFrom_Account() {
        return from_Account;
    }

    public void setFrom_Account(Long from_Account) {
        this.from_Account = from_Account;
    }

    public Long getTo_Account() {
        return to_Account;
    }

    public void setTo_Account(Long to_Account) {
        this.to_Account = to_Account;
    }

    public String getTransaction_Type() {
        return transaction_Type;
    }

    public void setTransaction_Type(String transaction_Type) {
        this.transaction_Type = transaction_Type;
    }

    public String getTransaction_Description() {
        return transaction_Description;
    }

    public void setTransaction_Description(String transaction_Description) {
        this.transaction_Description = transaction_Description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
