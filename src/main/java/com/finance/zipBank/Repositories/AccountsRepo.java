package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountsRepo extends CrudRepository<Accounts, Long> {
    List<Accounts> findAllByUserId (Long id);
    List<Accounts> findTop5ByUserId (Long id);
}
