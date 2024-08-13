import com.fcm.Club;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Club club = new Club("Lech Poznań", LocalDate.of(1921, 3, 19), 40_000_000);
        club.addPlayer("Zbigniew", "Mąciwoda", LocalDate.of(2001, 5, 24));
        club.printSquad();
        club.deletePlayer("Zbigniew", "Mąciwoda");
        club.printSquad();
    }
}
