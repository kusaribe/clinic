package com.kusaribe.spring.clinic.services;


import java.util.Set;

public interface CrudService<T, ID> {
    Set<T>  findAll();
    T findById(Long id);
    T save(T t);
    void deleteById(Long id);

    void delete(T object);
}
