package io.datajek.databaserelationships.onetoone.service;

import io.datajek.databaserelationships.onetoone.Player;
import io.datajek.databaserelationships.onetoone.PlayerProfile;
import io.datajek.databaserelationships.onetoone.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository repo;
    public Player assignProfile(int id, PlayerProfile profile) {
        Player player = repo.findById(id).get();
        player.setPlayerProfile(profile);
        return repo.save(player);
    }
}
