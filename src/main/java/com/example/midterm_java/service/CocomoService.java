package com.example.midterm_java.service;

import com.example.midterm_java.Repository.CocomoRepository;
import com.example.midterm_java.model.CostDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CocomoService {

    private final CocomoRepository cocomoRepository;

    @Autowired
    public CocomoService(CocomoRepository cocomoRepository) {
        this.cocomoRepository = cocomoRepository;
    }

    public void getValues(CostDriver cost)
    {
        cocomoRepository.getValues(cost);
    }
}
