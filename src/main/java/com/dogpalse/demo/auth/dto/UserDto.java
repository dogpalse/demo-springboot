package com.dogpalse.demo.auth.dto;

import java.io.Serializable;
import java.util.Date;

import com.dogpalse.demo.auth.entity.UserEntity;
import com.dogpalse.demo.core.util.DateUtil;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String userEmail;
    private String userNm;
    private String userId;
    private String userPw;

    private String enableYn;
    private Long loginFailCnt;
    private Date lastPwChangeDt;

    private Date registeredAt;
    private Date updatedAt;
    private Date deletedAt;

    public UserEntity toEntity() {
        return UserEntity.builder()
            .id(id)
            .userEmail(userEmail)
            .userNm(userNm)
            .userId(userId)
            .userPw(userPw)
            .enableYn(enableYn)
            .loginFailCnt(loginFailCnt)
            .lastPwChangeDt(DateUtil.convertDateToLocalDateTime(lastPwChangeDt))
            .registeredAt(DateUtil.convertDateToLocalDateTime(registeredAt))
            .updatedAt(DateUtil.convertDateToLocalDateTime(updatedAt))
            .deletedAt(DateUtil.convertDateToLocalDateTime(deletedAt))
            .build();
    }
}
