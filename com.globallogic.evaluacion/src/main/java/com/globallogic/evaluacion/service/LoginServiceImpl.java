package com.globallogic.evaluacion.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.evaluacion.model.User;
import com.globallogic.evaluacion.repository.UserRepository;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired private UserRepository userRepository;

	public User readUserByEmail(String email) {
		User user = null;
		
		user = userRepository.findByEmailIgnoreCase(email);
		
		return user;
	}


	public User readUserByToken(String token) {
		User user = null;
		
		user = userRepository.findByToken(token);
		
		return user;
	}

	public List<String> validateSignUp(User user) {
		List<String> errores = new ArrayList<String>();
		
		if(user.getName() == null || user.getName().isEmpty()) errores.add("Invalid name");

		if(user.getEmail() == null || user.getEmail().isEmpty()) errores.add("Invalid email");

		if(user.getPassword() == null || user.getPassword().isEmpty()) errores.add("Invalid password");
		
		// Se valida existencia de usuario solo si la data es valida
		if(errores.size() == 0) {
			User exist = readUserByEmail(user.getEmail());
			if(exist != null) errores.add("User exist");
		}

		return errores;
	}
	
	
	public User saveNewUser(User newUser) {
		newUser.setIsActive(true);
		newUser.setCreated(LocalDateTime.now());
		newUser.setToken("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqdWxpb0B0ZXN0...");
		
		return userRepository.save(newUser);
	}

	public User login(String token) {
		User user = this.readUserByToken(token);
		
		if(user != null) {
			//... el token debe cambiar al ejecutar por lo que se actualizará el token
			user.setToken("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqdWxpb0B0ZXN0...");
			
		}

		return userRepository.save(user);
	}
}
