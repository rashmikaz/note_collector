package com.example.notecollecter.service;

import com.example.notecollecter.dto.UserStatus;
import com.example.notecollecter.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);

    List<UserDTO>getAllUsers();

    UserStatus getUser(String UserId);

    void deleteUser(String UserId);

    void updateUser(String UserId,UserDTO userDTO);


}
