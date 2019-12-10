package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Account_Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Account_Status_Repo extends CrudRepository<Long, Account_Status> {
}
