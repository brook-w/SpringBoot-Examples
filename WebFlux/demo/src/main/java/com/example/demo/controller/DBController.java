package com.example.demo.controller;

import com.example.demo.repository.PersonRepository;
import com.example.demo.vo.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("dbtest")
public class DBController {

    private final PersonRepository personRepository;

    public DBController( PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("persons")
    public  Flux<Person> persons() {
        return personRepository.findAll();
    }
}
