package com.dogpalse.demo.auth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dogpalse.demo.auth.entity.UserRoleEntity;

public interface UserRoleDao extends JpaRepository<UserRoleEntity, Long> {
    
}
