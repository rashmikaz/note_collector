package com.example.notecollecter.service;

import com.example.notecollecter.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);

    List<UserDTO>getAllUsers();

    UserDTO getUser(String UserId);

    boolean deleteUser(String UserId);

    boolean updateUser(String UserId,UserDTO userDTO);


}
