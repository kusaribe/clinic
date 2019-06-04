package com.kusaribe.spring.clinic.services;

import com.kusaribe.spring.clinic.model.Owner;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface OwnerService extends  CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}


