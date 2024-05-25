package com.marcos.desenvolvimento.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.desenvolvimento.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserEmail(String email);
}