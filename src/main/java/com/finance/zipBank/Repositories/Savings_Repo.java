package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Savings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Savings_Repo extends CrudRepository<Long, Savings> {
}
