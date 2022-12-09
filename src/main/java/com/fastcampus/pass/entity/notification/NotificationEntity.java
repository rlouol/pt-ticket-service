package com.fastcampus.pass.entity.notification;

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
@Table(name = "notification")
public class NotificationEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer notificationSeq;

    @Column(nullable = false)
    private String uuid;

    @Column(nullable = false)
    private String event;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private Boolean sent = false;

    private LocalDateTime sentAt;
}
