package com.fastcampus.pass.repository.user;

import com.fastcampus.pass.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
