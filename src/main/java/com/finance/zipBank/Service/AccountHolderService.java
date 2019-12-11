package com.finance.zipBank.Service;


import com.finance.zipBank.Models.Login_Account;
import com.finance.zipBank.Repositories.Account_Holder_Repo;
import com.finance.zipBank.Repositories.Login_Account_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountHolderService {
    @Autowired
    private Account_Holder_Repo accountHolderRepo;

    @Autowired
    private Login_Account_Repo loginCredentialRepo;


    //creating and finding account

    public Login_Account createAccount(Login_Account login){
        return loginCredentialRepo.save(login);
    }

    public Login_Account findAccountById(Long id){
        return loginCredentialRepo.findById(id).get();
    }

    //updating user acccount credentials
    public Login_Account updateAccount(Long id, Login_Account login){

        //business logic
        return loginCredentialRepo.save(login);
    }


}
