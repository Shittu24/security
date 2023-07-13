package com.shittu24.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shittu24.security.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);
}
