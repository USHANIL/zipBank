package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Notes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepo extends CrudRepository<Notes, Long> {
}
