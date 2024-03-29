package com.micheal.week8jwt.repository;

import com.micheal.week8jwt.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<UserDetails> findByUsername(String username);

    boolean existsByUsername(String username);
}
