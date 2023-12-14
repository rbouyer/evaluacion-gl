package repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import model.User;

public interface UserRepository extends CrudRepository<User, UUID> {

	User findByEmailIgnoreCase(String email);

}
