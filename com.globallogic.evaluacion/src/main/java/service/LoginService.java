package service;

import model.User;

public interface LoginService {
	User readUser(String email);
}
