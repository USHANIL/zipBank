package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Transaction_History;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Transaction_History_Repo extends CrudRepository<Long, Transaction_History> {
}
