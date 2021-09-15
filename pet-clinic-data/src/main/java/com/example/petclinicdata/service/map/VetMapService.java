package com.example.petclinicdata.service.map;

import com.example.petclinicdata.model.Owner;
import com.example.petclinicdata.model.Vet;
import com.example.petclinicdata.service.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {


    @Override
    public Set<Vet> findALl() {
        return null;
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }
}
