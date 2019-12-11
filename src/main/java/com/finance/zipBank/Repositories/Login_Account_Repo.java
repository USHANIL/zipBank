package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Login_Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Login_Account_Repo extends CrudRepository<Login_Account, Long> {
}
