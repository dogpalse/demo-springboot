package com.dogpalse.demo.auth.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import com.dogpalse.demo.auth.dto.UserDto;
import com.dogpalse.demo.core.util.DateUtil;

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
        nullable = false,
        unique = true
    )
    private String userEmail;
    private String userNm;
    private String userId;
    private String userPw;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private UserRoleEntity userRole;

    // TODO : 부서 추가

    @ColumnDefault("'E'")
    @Column(
        length = 2,
        nullable = false
    )
    private String userStatus;

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
            .id(id)
            .userEmail(userEmail)
            .userNm(userNm)
            .userId(userId)
            .userPw(userPw)
            .userRole(userRole.toDto())
            .enableYn(enableYn)
            .loginFailCnt(loginFailCnt)
            .lastPwChangeDt(DateUtil.convertLocalDateTimeToDate(lastPwChangeDt))
            .registeredAt(DateUtil.convertLocalDateTimeToDate(registeredAt))
            .updatedAt(DateUtil.convertLocalDateTimeToDate(updatedAt))
            .deletedAt(DateUtil.convertLocalDateTimeToDate(deletedAt))
            .build();
    }
}
