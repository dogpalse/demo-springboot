package com.dogpalse.demo.auth.dto;

import com.dogpalse.demo.auth.entity.UserRoleEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleDto {
    
    private Long id;
    private String roleCd;
    private String roleNm;
    private String roleLevel;

    public UserRoleEntity toEntity() {
        return UserRoleEntity.builder()
            .id(id)
            .roleCd(roleCd)
            .roleNm(roleNm)
            .roleLevel(roleLevel)
            .build();
    }
}
