package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Notes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepo extends CrudRepository<Notes, Long> {

}
