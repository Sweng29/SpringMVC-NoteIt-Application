package com.mant.is.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "notebooks")
public class Notebook {

    @Id
    @GeneratedValue
    private Long noteBookId;
    private String noteBookName;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date updatedDate;
    @OneToMany(mappedBy = "nootbook", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Note> notes;

    public Long getNoteBookId() {
        return noteBookId;
    }

    public void setNoteBookId(Long noteBookId) {
        this.noteBookId = noteBookId;
    }

    public String getNoteBookName() {
        return noteBookName;
    }

    public void setNoteBookName(String noteBookName) {
        this.noteBookName = noteBookName;
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

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }
}
