package com.kusaribe.spring.clinic.services.map;

import com.kusaribe.spring.clinic.model.Speciality;
import com.kusaribe.spring.clinic.services.SpecilityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service

@Profile({"default", "map"})
public class SpecilityMapService extends  AbstractMapService<Speciality, Long> implements SpecilityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality t) {
        return super.save(t);
    }
}
