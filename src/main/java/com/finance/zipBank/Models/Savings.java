package com.finance.zipBank.Models;

import com.finance.zipBank.Service.SavingsService;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Savings extends Account{
    @Id
    private Long accountId;
    private Long accountNumber;
    private Long balance;
    private Long statusId;
    private Date lastUpdated;

    public Long getAccountId() {
        return accountId;
    }

}
