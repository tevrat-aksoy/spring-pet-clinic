package com.example.petclinicdata.service;


import com.example.petclinicdata.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{


    Owner findByLastName(String lastName);



}
