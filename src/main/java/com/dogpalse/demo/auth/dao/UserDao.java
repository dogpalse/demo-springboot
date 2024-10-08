package com.dogpalse.demo.auth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dogpalse.demo.auth.entity.UserEntity;

public interface UserDao extends JpaRepository<UserEntity, Long> {
    
}
