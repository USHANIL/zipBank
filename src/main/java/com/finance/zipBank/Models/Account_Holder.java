package com.finance.zipBank.Models;

import com.finance.zipBank.Service.AccountHolderService;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Account_Holder {

    @Id
    private Long account_Id;
    private String first_Name;
    private String last_Name;
    private Integer address_Id;
    private Integer phone_Number;
    private String email;
    private Date last_Updated;



    public Long getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Id(Long account_Id) {
        this.account_Id = account_Id;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public Integer getAddress_Id() {
        return address_Id;
    }

    public void setAddress_Id(Integer address_Id) {
        this.address_Id = address_Id;
    }

    public Integer getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(Integer phone_Number) {
        this.phone_Number = phone_Number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLast_Updated() {
        return last_Updated;
    }

    public void setLast_Updated(Date last_Updated) {
        this.last_Updated = last_Updated;
    }
}
