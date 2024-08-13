package com.fcm;

import java.time.LocalDate;

public class Player {
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;

    public Player(String name, String lastName, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
