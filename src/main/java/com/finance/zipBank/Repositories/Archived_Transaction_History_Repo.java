package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Archived_Transaction_History;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Archived_Transaction_History_Repo extends CrudRepository<Long, Archived_Transaction_History> {
}
