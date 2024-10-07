package com.example.notecollecter.dto.impl;

import com.example.notecollecter.dto.NoteStatus;
import com.example.notecollecter.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteDTO implements NoteStatus {

 private String noteId;
 private String noteTitle;
 private String noteDesc;
 private String createdDate;
 private String priorityLevel;
 private String userId;


}
