package com.kusaribe.spring.clinic.services;

import com.kusaribe.spring.clinic.model.Owner;

public interface OwnerService extends  CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}


