package com.finance.zipBank.Service;


import com.finance.zipBank.Models.Checking;
import com.finance.zipBank.Models.Savings;
import com.finance.zipBank.Repositories.Checking_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CheckingService {
    @Autowired
    private Checking_Repo checking_repo;

    //creating checking and savings/ finding them by id

    public Checking createChecking(Checking checking){
        return checking_repo.save(checking);
    }

    public Checking findCheckingById (Long id){
        return checking_repo.findById(id).get();
    }

    ///deleting checking and savings by id

    public Boolean deleteCheckingById(Long id){
        checking_repo.deleteById(id);
        return true;
    }

    ///updating accounts
    public Checking updateCheckingAccount(Long id, Checking checking){
        //business logic
        return checking;
    }

    public Savings updateSavingsAccount(Long id, Savings savings){
        //business logic
        return savings;
    }





}
