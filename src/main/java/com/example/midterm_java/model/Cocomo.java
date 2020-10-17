package com.example.midterm_java.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cocomo {


    private double effort;
    private double time;
    private int staff;

    public Cocomo(@JsonProperty("effort") double effort,
                  @JsonProperty("time")  double time,
                  @JsonProperty("staff") int staff) {
        this.effort = effort;
        this.time = time;
        this.staff = staff;
    }

    public double getEffort() {
        return effort;
    }

    public double getTime() {
        return time;
    }

    public int getStaff() {
        return staff;
    }
}
