package com.fastcampus.pass.entity.pass;

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
@Table(name = "pass")
public class PassEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passSeq;

    private Integer packageSeq;
    private String userId;

    @Enumerated(EnumType.STRING)
    private PassStatus status;
    private Integer remainingCount;

    @Column(updatable = false, nullable = false)
    private LocalDateTime startedAt;

    private LocalDateTime endedAt;
    private LocalDateTime expiredAt;
}
