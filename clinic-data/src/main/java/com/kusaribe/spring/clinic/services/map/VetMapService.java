package com.kusaribe.spring.clinic.services.map;

import com.kusaribe.spring.clinic.model.Speciality;
import com.kusaribe.spring.clinic.model.Vet;
import com.kusaribe.spring.clinic.services.SpecilityService;
import com.kusaribe.spring.clinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private  final SpecilityService specilityService;

    public VetMapService(SpecilityService specilityService) {
        this.specilityService = specilityService;
    }

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
        if(vet.getSpeciality().size() > 0){
            vet.getSpeciality().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecility = specilityService.save(speciality);
                    speciality.setId(savedSpecility.getId());
                }
            });
        }

        return super.save( vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}


