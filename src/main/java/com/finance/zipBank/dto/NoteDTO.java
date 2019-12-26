package com.finance.zipBank.dto;



public class NoteDTO {
    private Long userId;
    private String note;


    public NoteDTO(Long userId, String note) {
        this.userId = userId;
        this.note = note;
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


}
