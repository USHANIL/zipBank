package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepo extends CrudRepository<Accounts, Long> {
}
