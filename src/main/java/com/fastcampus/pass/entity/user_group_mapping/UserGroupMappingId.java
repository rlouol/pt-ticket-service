package com.fastcampus.pass.entity.user_group_mapping;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserGroupMappingId implements Serializable {
    private String userGroupId;
    private String userId;
}
