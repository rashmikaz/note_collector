package com.example.notecollecter.service;

import com.example.notecollecter.dto.impl.UserDTO;

import java.util.List;

public class UserServiceIMPL implements UserService{
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public UserDTO getUser(String UserId) {
        return null;
    }

    @Override
    public boolean deleteUser(String UserId) {
        return false;
    }

    @Override
    public boolean updateUser(String UserId, UserDTO userDTO) {
        return false;
    }
}
