package com.ust.Springboot_docker.controller;


import com.ust.Springboot_docker.model.Person;
import com.ust.Springboot_docker.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {


    @Autowired

    private PersonRepo personRepo;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/add")
    public  Person addPerson(Person person){
        return personRepo.save(person);
    }

    @GetMapping("/get")
    public List<Person> getPerson(){
        return personRepo.findAll();
    }

    @GetMapping("/get/{id}")
    public Person getPersonById(int id){
        return personRepo.findById(id).get();
    }
}
