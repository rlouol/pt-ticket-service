package com.fastcampus.pass.entity.bulk_pass;

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
@Table(name = "bulk_pass")
public class BulkPassEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bulkPassSeq;

    private Integer packageSeq;
    private String userGroupId;
    private String status;
    private Integer count;

    @Column(updatable = false, nullable = false)
    private LocalDateTime startedAt;

    private LocalDateTime endedAt;
}
