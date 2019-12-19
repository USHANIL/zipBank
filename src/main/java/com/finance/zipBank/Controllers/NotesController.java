package com.finance.zipBank.Controllers;

import com.finance.zipBank.Service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class NotesController {

    @Autowired
    private NotesService notesService;




}
