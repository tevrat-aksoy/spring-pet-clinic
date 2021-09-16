package com.example.petclinicweb.controller;


import com.example.petclinicdata.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets","vet"})
    public String listOfVets(Model model){
        model.addAllAttributes("vets",vetService.findALl());

        return "vets/index";
    }

}
