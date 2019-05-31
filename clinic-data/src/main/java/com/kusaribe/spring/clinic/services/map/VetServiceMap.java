package com.kusaribe.spring.clinic.services.map;

import com.kusaribe.spring.clinic.model.Vet;
import com.kusaribe.spring.clinic.services.VetService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }


    @Override
    public Vet save(Vet vet) {
        return super.save( vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}


