package com.example.midterm_java.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cocomo {


    private double effort;
    private double time;
    private int staff;
    private String mode;

    public Cocomo(@JsonProperty("effort") double effort,
                  @JsonProperty("time")  double time,
                  @JsonProperty("staff") int staff,
                  @JsonProperty("mode") String mode
    ) {
        this.effort = effort;
        this.time = time;
        this.staff = staff;
        this.mode = mode;
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

    public String getMode() {
        return mode;
    }
}
