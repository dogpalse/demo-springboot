package com.dogpalse.demo.auth.service;

import java.util.List;

import com.dogpalse.demo.auth.dto.UserDto;

public interface UserService {
    
    List<UserDto> selectUserList();
}
