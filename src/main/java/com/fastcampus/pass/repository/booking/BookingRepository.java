package com.fastcampus.pass.repository.booking;

import com.fastcampus.pass.entity.booking.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingEntity, Integer> {
}
