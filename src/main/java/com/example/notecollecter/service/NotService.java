package com.example.notecollecter.service;

import com.example.notecollecter.dto.impl.NoteDTO;

import java.util.List;

public interface NotService {


    NoteDTO saveNote(NoteDTO noteDTO);

    List<NoteDTO> getAllNotes();

    NoteDTO getNote(String noteId);

    boolean deleteNote(String noteId);

    boolean updateNote(NoteDTO noteDTO,String noteId);

}
