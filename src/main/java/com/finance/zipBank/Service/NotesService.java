package com.finance.zipBank.Service;

import com.finance.zipBank.Repositories.NotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesService {

    @Autowired
    private NotesRepo notesRepo;
}
