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
        if(checkPlayer(playerName, playerLastName) == null) {
            players.add(new Player(playerName, playerLastName, dateOfBirth));
            System.out.println(playerName + " " + playerLastName + " has been added to the squad.");
        } else {
            System.out.println("Player is already part of the squad.");
        }
    }

    public void deletePlayer(String playerName, String playerLastName) {
        System.out.println(checkPlayer(playerName, playerLastName));
        if(checkPlayer(playerName, playerLastName) != null) {
            players.remove(checkPlayer(playerName, playerLastName));
            System.out.println("Player has been deleted from the squad.");
        } else {
            System.out.println("Player is not part of the squad. Cannot delete.");
        }
    }

    public void printSquad() {
        players.forEach(player -> {
            System.out.println(player.getName() + " " + player.getLastName());
        });
    }

    private Player checkPlayer(String playerName, String playerLastName) {
        for (int i = 0; i < players.size() - 1; i++) {
            if(players.get(i).getName().equalsIgnoreCase(playerName)
            && players.get(i).getLastName().equalsIgnoreCase(playerLastName)) {
                // player exists in the squad
                System.out.println(players.get(i));
                return players.get(i);
            }
        }
        return null;
    }

}
