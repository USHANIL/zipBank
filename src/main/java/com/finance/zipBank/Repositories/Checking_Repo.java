package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Checking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Checking_Repo extends CrudRepository<Checking, Long> {
}
