package com.kusaribe.spring.clinic.repository;

import com.kusaribe.spring.clinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
