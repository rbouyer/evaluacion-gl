package com.globallogic.evaluacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.evaluacion.model.User;
import com.globallogic.evaluacion.repository.UserRepository;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired private UserRepository userRepository;

	public User readUser(String email) {
		User user = null;
		
		user = userRepository.findByEmailIgnoreCase(email);
		
		return user;
	}

}
