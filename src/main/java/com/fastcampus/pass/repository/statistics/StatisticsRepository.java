package com.fastcampus.pass.repository.statistics;

import com.fastcampus.pass.entity.statistics.StatisticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticsRepository extends JpaRepository<StatisticsEntity, Integer> {
}
