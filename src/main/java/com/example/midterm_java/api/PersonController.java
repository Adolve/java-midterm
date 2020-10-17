package com.example.midterm_java.api;

import com.example.midterm_java.model.Person;
import com.example.midterm_java.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<?> addPerson(@Valid @RequestBody Person person) {
        personService.addPerson(person);

        HttpHeaders responseHeader = new HttpHeaders();
        return new ResponseEntity<>(person, responseHeader, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }
}
