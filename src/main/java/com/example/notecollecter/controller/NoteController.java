package com.example.notecollecter.controller;

import com.example.notecollecter.dto.impl.NoteDTO;
import com.example.notecollecter.service.NotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notes")
public class NoteController {//http request handle by this class and all are public method

    @Autowired
    private NotService notService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO saveNote(@RequestBody NoteDTO noteDTO) {
//        noteDTO.setNoteId(Apputil.generateId());
//        return noteDTO;
        return notService.saveNote(noteDTO);
    }
    public NoteDTO getSelectedNote(){

        return null;
    }
    public List<NoteDTO> getALlNotes(){

        return null;
    }
    public void deleteNote(String noteId){

    }
    public void updateNote(String noteId,NoteDTO noteDTO){

    }



}
