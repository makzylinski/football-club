package com.fcm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Club {
    List<Player> players = new ArrayList<>();
    String name;
    LocalDate dateOfEstablishment;
    double budget;

    public Club(String name, LocalDate dateOfEstablishment, double budget) {
        this.name = name;
        this.dateOfEstablishment = dateOfEstablishment;
        this.budget = budget;
    }

    public void addPlayer(String playerName, String playerLastName, LocalDate dateOfBirth) {
        if(checkPlayer(playerName, playerLastName)) {
            players.add(new Player(playerName, playerLastName, dateOfBirth));
        } else {
            System.out.println("Player is already part of the squad.");
        }
    }

    private boolean checkPlayer(String playerName, String playerLastName) {
        for (int i = 0; i < players.size() - 1; i++) {
            return !players.get(i).getName().equalsIgnoreCase(playerName) ||
                    !players.get(i).getLastName().equalsIgnoreCase(playerLastName);
        }
        return false;
    }
}
