package io.datajek.tennisplayername;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.sql.Date;
import java.util.List;

@Service
public class PlayerService {
    private List<Player> players = Arrays.asList(
            new Player(1, "Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81),
            new Player(2, "Monfils", "France", Date.valueOf("1986-07-01"), 10),
            new Player(3, "Isner", "USA", Date.valueOf("1985-04-26"), 15)
    );

    public Player getPlayerByName(String name) {
        return players.stream().filter(p -> p.getName().equals(name)).findFirst().get();
    }
}
