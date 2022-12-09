package com.fastcampus.pass.repository.pass;

import com.fastcampus.pass.entity.pass.PassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassRepository extends JpaRepository<PassEntity, Integer> {
}
