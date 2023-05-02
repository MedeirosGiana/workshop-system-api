package com.workshop.workshop.system.repositories;

import com.workshop.workshop.system.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
}
