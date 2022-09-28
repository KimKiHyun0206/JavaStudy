package 협력하는객체들의공동체.객체들은_자율적이어야_한다;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Playground {
    public static void main(String[] args) {
        Set<FootballPlayer> footballPlayers = new HashSet<>();

        FootballPlayer parkJiSung = new ParkJiSung();
        FootballPlayer sonHeungMin = new SonHeungMin();
        FootballPlayer chicken = new Player("zigzag");

        parkJiSung.shoot();
        sonHeungMin.shoot();
        chicken.shoot();
    }
}
