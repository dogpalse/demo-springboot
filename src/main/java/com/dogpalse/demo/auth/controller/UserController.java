package com.dogpalse.demo.auth.controller;

import org.springframework.web.bind.annotation.RestController;

import com.dogpalse.demo.auth.dto.UserDto;
import com.dogpalse.demo.auth.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Slf4j
@RequestMapping(value = "users")
@Tag(name = "유저 정보", description = "유저 관련 API")
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @Operation(summary = "유저 목록 조회")
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200",
            description = "유저 목록 조회 성공",
            content = {
                @Content(
                    mediaType = MediaType.APPLICATION_JSON_VALUE, 
                    array = @ArraySchema(
                        schema = @Schema(
                            implementation = UserDto.class
                        )
                    )
                )
            }
        )
    })
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDto> selectUserList() {
        List<UserDto> userList = userService.selectUserList();
        return userList;
    }

    @Operation(summary = "유저 등록")
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200",
            description = "유저 등록 성공",
            content = {
                @Content(
                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                    schema = @Schema(implementation = UserDto.class)
                )
            }
        )
    })
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDto insertUser(@RequestBody UserDto userDto) {
        
        UserDto user = userService.insertUser(userDto);

        return user;
    }
    
}
