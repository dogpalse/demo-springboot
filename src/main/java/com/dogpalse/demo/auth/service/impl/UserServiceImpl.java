package com.dogpalse.demo.auth.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.dogpalse.demo.auth.dao.UserDao;
import com.dogpalse.demo.auth.dto.UserDto;
import com.dogpalse.demo.auth.entity.UserEntity;
import com.dogpalse.demo.auth.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserDto> selectUserList() {
        
        List<UserEntity> userEntityList = userDao.findAll();
        log.info("userEntityList : {}", userEntityList);
        List<UserDto> userList = new ArrayList<>();

        if (!CollectionUtils.isEmpty(userEntityList)) {
            userEntityList.forEach(user -> userList.add(user.toDto()));
        }
        log.info("userList : {}", userList);

        return userList;
    }

    @Override
    public UserDto insertUser(UserDto userDto) {

        log.info("userDto : {}", userDto);
        if (userDto == null) {
            log.error("유저 정보가 없습니다.");
            return null;
        }

        UserEntity userEntity = userDao.save(userDto.toEntity());
        log.info("userEntity : {}", userEntity);
        log.info("유저 등록 성공");

        return userEntity.toDto();
    }
}
