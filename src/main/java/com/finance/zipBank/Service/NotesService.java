package com.finance.zipBank.Service;

import com.finance.zipBank.Models.Notes;
import com.finance.zipBank.Models.User;
import com.finance.zipBank.Repositories.NotesRepo;
import com.finance.zipBank.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {

    @Autowired
    private NotesRepo notesRepo;

    @Autowired
    private UserRepo userRepo;


    //find all notes by user
    public List<Notes> findNotesByUser(Long id){
        User user = userRepo.findById(id).get();
        return notesRepo.findAllByUser(user);
    }

    //create a note






}
