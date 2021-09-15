package com.example.petclinicdata.service.map;


import com.example.petclinicdata.model.Owner;
import com.example.petclinicdata.service.CrudService;

import java.util.Set;

public class OwnerMapService  extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findALl() {
        return super.findall();
    }

    @Override
    public void deleteByID(Long id) {

        super.deleteByID(id);

    }

    @Override
    public void delete(Owner object) {

        super.delete(object);

    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }
}
