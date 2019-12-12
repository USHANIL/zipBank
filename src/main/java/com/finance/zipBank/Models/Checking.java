package com.finance.zipBank.Models;

import com.finance.zipBank.Service.CheckingService;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Checking extends Account{
    @Id
    private Long accountId;
    private Long accountNumber;
    private Long balance;
    private Long statusId;
    private Date lastUpdated;


}
