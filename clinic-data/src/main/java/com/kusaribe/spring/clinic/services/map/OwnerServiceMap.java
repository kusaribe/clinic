package com.kusaribe.spring.clinic.services.map;

import com.kusaribe.spring.clinic.model.Owner;
import com.kusaribe.spring.clinic.services.CrudService;

import java.util.Set;
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    Owner save(Long aLong, Owner owner) {
        return super.save(aLong, owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }


    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}


