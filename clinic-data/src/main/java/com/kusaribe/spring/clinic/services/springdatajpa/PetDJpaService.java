package com.kusaribe.spring.clinic.services.springdatajpa;


import com.kusaribe.spring.clinic.model.Pet;
import com.kusaribe.spring.clinic.repository.PetRepository;
import com.kusaribe.spring.clinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }
}
