package com.example.petclinicdata.service.map;

import com.example.petclinicdata.model.Owner;
import com.example.petclinicdata.model.Pet;
import com.example.petclinicdata.service.CrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {


    @Override
    public Set<Pet> findALl() {
        return super.findall();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findByID(Long id) {
        return super.findByID(id);
    }
}
