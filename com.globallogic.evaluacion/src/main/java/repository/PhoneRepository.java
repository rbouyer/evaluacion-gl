package repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import model.Phone;

public interface PhoneRepository extends CrudRepository<Phone, UUID> {

}
