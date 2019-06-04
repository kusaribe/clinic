package com.kusaribe.spring.clinic.repository;

import com.kusaribe.spring.clinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
