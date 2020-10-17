package com.example.midterm_java.Repository;

import com.example.midterm_java.model.Cocomo;
import com.example.midterm_java.model.CostDriver;

public interface CocomoDataService {

    Cocomo getValues(CostDriver cost);
}
