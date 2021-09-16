package com.example.petclinicweb.bootstrap;


import com.example.petclinicdata.model.Owner;
import com.example.petclinicdata.service.OwnerService;
import com.example.petclinicdata.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setFirstName("tevrat");
        owner1.setLastName("aksoy");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("ümüt");
        owner2.setLastName("asddd");

        ownerService.save(owner2);

    }
}
