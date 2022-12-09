package com.fastcampus.pass.repository.bulk_pass;

import com.fastcampus.pass.entity.bulk_pass.BulkPassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulkPassRepository extends JpaRepository<BulkPassEntity, Integer> {
}
