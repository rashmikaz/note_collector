package com.example.notecollecter.dao;

import com.example.notecollecter.entity.Impl.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity,String> {
}
