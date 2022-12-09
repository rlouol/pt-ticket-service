package com.fastcampus.pass.entity.statistics;

import com.fastcampus.pass.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "statistics")
public class StatisticsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer statisticsSeq;

    @Column(nullable = false)
    private LocalDateTime statisticsAt;

    @Column(nullable = false)
    private Integer allCount = 0;

    @Column(nullable = false)
    private Integer attendedCount = 0;

    @Column(nullable = false)
    private Integer cancelledCount = 0;
}
