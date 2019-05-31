package com.kusaribe.spring.clinic.services.map;

import com.kusaribe.spring.clinic.model.Pet;
import com.kusaribe.spring.clinic.services.PetService;
import org.springframework.stereotype.Service;
import java.util.Set;


@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }


    @Override
    public Pet save(Pet pet) {
        return super.save( pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}


