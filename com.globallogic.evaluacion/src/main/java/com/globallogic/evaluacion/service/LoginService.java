package com.globallogic.evaluacion.service;

import org.springframework.stereotype.Service;

import com.globallogic.evaluacion.model.User;

@Service
public interface LoginService {
	User readUser(String email);
}
