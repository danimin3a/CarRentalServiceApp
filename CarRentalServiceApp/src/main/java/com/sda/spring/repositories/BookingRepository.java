package com.sda.spring.repositories;

import com.sda.spring.entities.BookingEntity;
import com.sda.spring.entities.CarsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository  extends JpaRepository<BookingEntity, Integer> {
}

