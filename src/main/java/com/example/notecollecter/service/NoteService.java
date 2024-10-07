package com.example.notecollecter.service;

import com.example.notecollecter.dto.NoteStatus;
import com.example.notecollecter.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {


    void saveNote(NoteDTO noteDTO);

    List<NoteDTO> getAllNotes();

    NoteStatus getNote(String noteId);

    void deleteNote(String noteId);

    void updateNote(String noteId, NoteDTO noteDTO);
}
