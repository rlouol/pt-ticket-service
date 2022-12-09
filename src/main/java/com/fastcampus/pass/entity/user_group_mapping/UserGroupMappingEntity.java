package com.fastcampus.pass.entity.user_group_mapping;

import com.fastcampus.pass.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user_group_mapping")
@IdClass(UserGroupMappingId.class)
public class UserGroupMappingEntity extends BaseEntity {
    @Id
    @Column(nullable = false)
    private String userGroupId;

    @Id
    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String userGroupName;

    @Column(nullable = false)
    private String description;
}
