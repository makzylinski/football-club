package com.fcm;

import java.time.LocalDate;

public class Player extends PlayerStats {
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;

    public Player(String name, String lastName, LocalDate dateOfBirth, Positions position) {
        super(position);
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
