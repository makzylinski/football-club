package com.fcm;

import java.time.LocalDate;
import java.time.Year;

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

    public Player(Positions position, int overall, int goalkeeping, int sprint, int passing, int scoring, int defending, int dribbling, int longBalls, String name, String lastName, LocalDate dateOfBirth) {
        super(position, overall, goalkeeping, sprint, passing, scoring, defending, dribbling, longBalls);
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

    public int getAge() {
        return Year.now().getValue() - dateOfBirth.getYear();
    }
}
