package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.Notes;
import com.finance.zipBank.Service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotesController {

    @Autowired
    private NotesService notesService;



    @GetMapping("/notes/{id}")
    public ResponseEntity<List<Notes>> findAllNotes(@PathVariable Long id){
        return new ResponseEntity<>(notesService.findNotesByUser(id), HttpStatus.OK);
    }
}
