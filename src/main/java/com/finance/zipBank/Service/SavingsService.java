package com.finance.zipBank.Service;

import com.finance.zipBank.Models.Savings;
import com.finance.zipBank.Repositories.Savings_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavingsService {

    @Autowired
    private Savings_Repo savings_repo;

    //creating checking and savings/ finding them by i

    public Savings createSavings(Savings savings){
        return savings_repo.save(savings);
    }

    public Savings findSavingsById (Long id){
        return savings_repo.findById(id).get();
    }

    ///deleting checking and savings by id

    public Boolean deleteSavingsById(Long id){
        savings_repo.deleteById(id);
        return true;
    }

    ///updating accounts
    public Savings updateSavingsAccount(Long id, Savings savings){
        //business logic
        return savings;
    }


}
