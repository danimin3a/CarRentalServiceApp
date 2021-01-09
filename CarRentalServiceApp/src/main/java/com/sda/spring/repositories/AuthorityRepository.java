package com.sda.spring.repositories;

import com.sda.spring.entities.AuthoritiesEntity;
import com.sda.spring.entities.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<AuthoritiesEntity, Integer> {
}
