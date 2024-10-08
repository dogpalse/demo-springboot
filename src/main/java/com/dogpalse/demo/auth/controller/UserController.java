package com.dogpalse.demo.auth.controller;

import org.springframework.web.bind.annotation.RestController;

import com.dogpalse.demo.auth.dto.UserDto;
import com.dogpalse.demo.auth.service.UserService;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@RequestMapping(value = "/api/v1/users")
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping()
    public List<UserDto> getMethodName() {
        List<UserDto> userList = userService.selectUserList();
        return userList;
    }
    
}
