package com.dogpalse.demo.auth.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.dogpalse.demo.auth.dto.UserDto;

public interface UserService {
    
    /**
     * 유저 목록 조회
     * @return
     */
    List<UserDto> selectUserList();

    /**
     * 유저 등록
     * @param userDto
     * @return
     */
    UserDto insertUser(UserDto userDto);
}
