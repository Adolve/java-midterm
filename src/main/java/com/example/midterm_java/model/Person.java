package com.example.midterm_java.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.UUID;


public class Person {


    private final UUID id;

    @Pattern(regexp = "aaa|xxx$", message = "values must be bwteen")
    @NotNull(message = "lol")
    private final String name;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }



}
