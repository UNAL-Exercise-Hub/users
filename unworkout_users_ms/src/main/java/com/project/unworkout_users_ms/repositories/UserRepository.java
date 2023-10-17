package com.project.unworkout_users_ms.repositories;

import com.project.unworkout_users_ms.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
