package com.example.notecollecter.service;

import com.example.notecollecter.dto.impl.NoteDTO;
import com.example.notecollecter.utill.AppUtil;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoteServiceIMPL implements NotService{
//    private static List<NoteDTO> noteDTOList = new ArrayList<>();


    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteId(AppUtil.generateNoteId());
//        noteDTOList.add(noteDTO);
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return null;
    }

    @Override
    public NoteDTO getNote(String noteId) {
        return null;
    }

    @Override
    public boolean deleteNote(String noteId) {
        return false;
    }

    @Override
    public boolean updateNote(NoteDTO noteDTO, String noteId) {
        return false;
    }
}
