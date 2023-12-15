package com.globallogic.evaluacion.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.evaluacion.model.Phone;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, UUID> {

}
