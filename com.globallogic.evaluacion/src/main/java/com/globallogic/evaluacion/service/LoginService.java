package com.globallogic.evaluacion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.evaluacion.model.User;

@Service
public interface LoginService {
	User readUserByEmail(String email);
	User readUserByToken(String token);
	List<String> validateSignUp(User user);
	User saveNewUser(User newUser);
	 User login(String token);
}
