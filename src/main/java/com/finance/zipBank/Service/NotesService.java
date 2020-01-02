package com.finance.zipBank.Service;

import com.finance.zipBank.Models.Notes;
import com.finance.zipBank.Models.User;
import com.finance.zipBank.Repositories.NotesRepo;
import com.finance.zipBank.Repositories.UserRepo;
import com.finance.zipBank.dto.NoteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class NotesService {

    @Autowired
    private NotesRepo notesRepo;

    @Autowired
    private UserRepo userRepo;

    //create a note
    public Notes createNote (Long id, NoteDTO note){

        String noteString = note.getNote();

        User user = userRepo.findById(id).get();

        Notes newNotes = new Notes();

        newNotes.setUserId(user.getUserId());
        newNotes.setNote(noteString);
        newNotes.setNoteDate(new Date());

        return notesRepo.save(newNotes);
    }

    public Notes findIdByNoteId(Long id){
        return notesRepo.findNotesByNoteId(id);
    }

    //get all notes by userId
    public List<Notes> findNotesByUserId(Long id){
        return notesRepo.findAllByUserIdOrderByNoteDate(id);
    }

    //update note
    public Notes updateNote(Long id, NoteDTO note){
        String noteString = note.getNote();

        Notes noteUpdate = notesRepo.findById(id).get();

        noteUpdate.setNote(noteString);

        return notesRepo.save(noteUpdate);
    }

    //delete note
    public Boolean deleteNote (Long id){
        if(notesRepo.existsById(id)){
            notesRepo.deleteById(id);
            return true;
        }else
            return false;
    }




}