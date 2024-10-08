package com.dogpalse.demo.auth.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import com.dogpalse.demo.auth.dto.UserDto;
import com.dogpalse.demo.core.DateUtil;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "TB_USER")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
        name = "email",
        nullable = false,
        unique = true
    )
    private String email;
    private String userNm;
    private String userId;
    private String userPw;

    @ColumnDefault("'Y'")
    @Column(
        length = 1,
        nullable = false
    )
    private String enableYn;

    @ColumnDefault("0")
    private Long loginFailCnt;
    private LocalDateTime lastPwChangeDt;

    private LocalDateTime registeredAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public UserDto toDto() {
        return UserDto.builder()
            .email(email)
            .userNm(userNm)
            .userId(userId)
            .userPw(userPw)
            .enableYn(enableYn)
            .loginFailCnt(loginFailCnt)
            .lastPwChangeDt(DateUtil.convertLocalDateTimeToDate(lastPwChangeDt))
            .registeredAt(DateUtil.convertLocalDateTimeToDate(registeredAt))
            .updatedAt(DateUtil.convertLocalDateTimeToDate(updatedAt))
            .deletedAt(DateUtil.convertLocalDateTimeToDate(deletedAt))
            .build();
    }
}
