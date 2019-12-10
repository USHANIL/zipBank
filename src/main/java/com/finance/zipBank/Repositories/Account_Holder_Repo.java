package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Account_Holder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Account_Holder_Repo extends CrudRepository<Long, Account_Holder> {
}
