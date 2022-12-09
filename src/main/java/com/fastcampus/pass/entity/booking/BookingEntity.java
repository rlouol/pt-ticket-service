package com.fastcampus.pass.entity.booking;

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
@Table(name = "booking")
public class BookingEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingSeq;

    private Integer passSeq;
    private String userId;
    private String status;
    private Boolean usedPass = false;
    private Boolean attended = false;

    @Column(updatable = false, nullable = false)
    private LocalDateTime startedAt;

    @Column(updatable = false, nullable = false)
    private LocalDateTime endedAt;

    private LocalDateTime cancelledAt;
}
