package com.kusaribe.spring.clinic.repository;

import com.kusaribe.spring.clinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
