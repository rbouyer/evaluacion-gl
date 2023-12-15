package com.globallogic.evaluacion.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.evaluacion.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

	User findByEmailIgnoreCase(String email);

	User findByToken(String token);

}
