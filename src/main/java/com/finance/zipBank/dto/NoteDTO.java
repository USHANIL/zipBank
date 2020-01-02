package com.finance.zipBank.dto;


import com.fasterxml.jackson.annotation.JsonCreator;

public class NoteDTO {
    private String note;



    public NoteDTO() {
    }

    @JsonCreator
    public NoteDTO(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}
