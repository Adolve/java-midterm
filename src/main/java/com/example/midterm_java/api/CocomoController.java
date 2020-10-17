package com.example.midterm_java.api;

import com.example.midterm_java.model.Cocomo;
import com.example.midterm_java.model.CostDriver;
import com.example.midterm_java.model.Person;
import com.example.midterm_java.service.CocomoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/api/cocomo")
@RestController
public class CocomoController {

    private final CocomoService cocomoService;

    @Autowired
    public CocomoController(CocomoService cocomoService) {
        this.cocomoService = cocomoService;
    }

    @PostMapping
    public Cocomo addPerson(@Valid @RequestBody CostDriver cost) {
        return cocomoService.getValues(cost);

    }
}
