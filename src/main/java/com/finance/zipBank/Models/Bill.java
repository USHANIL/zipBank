package com.finance.zipBank.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;
    private Long userId;
    private String recipient;
    private String purpose;
    private Double amount;
    private LocalDate initialBillDate;
    private Integer billCycle;


    public Long getBillID() {
        return billId;
    }

    public void setBillID(Long billID) {
        this.billId = billID;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getInitialBillDate() {
        return initialBillDate;
    }

    public void setInitialBillDate(LocalDate initialBillDate) {
        this.initialBillDate = initialBillDate;
    }

    public Integer getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(Integer billCycle) {
        this.billCycle = billCycle;
    }
}
