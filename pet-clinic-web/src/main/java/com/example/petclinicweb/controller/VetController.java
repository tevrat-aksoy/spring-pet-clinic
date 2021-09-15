package com.example.petclinicweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","vet"})
    public String listOfVets(){

        return "vets/index";
    }

}
