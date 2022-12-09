package com.fastcampus.pass.repository.notification;

import com.fastcampus.pass.entity.notification.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<NotificationEntity, Integer> {
}
