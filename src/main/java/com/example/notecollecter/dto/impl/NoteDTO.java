package com.example.notecollecter.dto.impl;

import com.example.notecollecter.dto.SuperDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteDTO implements SuperDto {

 private String noteId;
 private String noteTitle;
 private String noteDesc;
 private String createdDate;
 private String priorityLevel;
 private String userId;


}
