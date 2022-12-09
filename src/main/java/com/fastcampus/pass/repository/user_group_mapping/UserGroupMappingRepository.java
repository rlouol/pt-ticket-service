package com.fastcampus.pass.repository.user_group_mapping;

import com.fastcampus.pass.entity.user_group_mapping.UserGroupMappingEntity;
import com.fastcampus.pass.entity.user_group_mapping.UserGroupMappingId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupMappingRepository extends JpaRepository<UserGroupMappingEntity, UserGroupMappingId> {
}
