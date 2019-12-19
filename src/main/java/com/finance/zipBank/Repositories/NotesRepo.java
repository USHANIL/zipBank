package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Notes;
import com.finance.zipBank.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepo extends CrudRepository<Notes, Long> {

    List<Notes> findAllByUser(User user);
}
