package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class Person {
    private final UUID uid;

    private final String name;

    public Person(@JsonProperty("id") UUID uid, @JsonProperty("name") String name) {
        this.uid = uid;
        this.name = name;
    }

    public UUID getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }
}
