
package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.Notes;
import com.finance.zipBank.Service.NotesService;
import com.finance.zipBank.Models.dto.NoteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(maxAge = 3000)
public class NotesController {

    @Autowired
    private NotesService notesService;


    @PostMapping("/user/{id}/note")
    public ResponseEntity<Notes> createNote(@PathVariable Long id, @RequestBody NoteDTO note){
        return new ResponseEntity<>(notesService.createNote(id, note), HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}/notes")
    public ResponseEntity<List<Notes>> findAllNotesByUserId (@PathVariable Long id){
        return new ResponseEntity<>(notesService.findNotesByUserId(id), HttpStatus.OK);
    }

    @PutMapping("/user/notes/{id}")
    public ResponseEntity<Notes> updateNote(@PathVariable Long id, @RequestBody NoteDTO note){
        return new ResponseEntity<>(notesService.updateNote(id, note), HttpStatus.OK);
    }

    @DeleteMapping("/user/notes/{id}/delete")
    public ResponseEntity<Boolean> deleteNote(@PathVariable Long id){
        return new ResponseEntity<>(notesService.deleteNote(id), HttpStatus.OK);
    }
}