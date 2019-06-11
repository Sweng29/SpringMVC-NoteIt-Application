package com.mant.is.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue
    private Long noteId;
    private String note;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date updatedDate;
    @ManyToOne
    @JoinColumn(name = "notebook_id")
    private Notebook notebook;

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
