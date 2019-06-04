package com.kusaribe.spring.clinic.repository;

import com.kusaribe.spring.clinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String last_name);


    List<Owner> findAllByLastNameLike(String lastName);
}
