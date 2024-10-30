package com.dogpalse.demo.auth.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dogpalse.demo.auth.dto.UserRoleDto;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "TB_USER_ROLE")
public class UserRoleEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
        length = 30,
        nullable = false
    )
    private String roleCd;

    @Column(
        length = 50,
        nullable = false
    )
    private String roleNm;

    @Column(
        nullable = false
    )
    private String roleLevel;

    public UserRoleDto toDto() {
        return UserRoleDto.builder()
            .id(id)
            .roleCd(roleCd)
            .roleNm(roleNm)
            .roleLevel(roleLevel)
            .build();
    }
}
