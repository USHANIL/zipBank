package com.finance.zipBank.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long noteId;
    private Long userId;
    private String note;
    private Date noteDate;

    public Notes() {
    }

    public Notes(String note, Date noteDate) {
        this.note = note;
        this.noteDate = noteDate;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Date noteDate) {
        this.noteDate = noteDate;
    }
}
