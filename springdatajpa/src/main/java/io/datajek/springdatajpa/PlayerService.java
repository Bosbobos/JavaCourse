package io.datajek.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerSpringDataRepository repo;

    public List<Player> getAllPlayers() {
        return repo.findAll();
    }

    public Player getPlayer(int id) {
        var tempPlayer = repo.findById(id);

        if (tempPlayer.isEmpty())
            throw new RuntimeException("Player with id "+ id + " not found.");

        return tempPlayer.get();
    }

    public Player addPlayer(Player player) {
        return repo.save(player);
    }

    public Player updatePlayer(Player player) {
        return repo.save(player);
    }
}
