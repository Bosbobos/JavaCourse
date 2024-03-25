package io.datajek.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class PlayerService {
    @Autowired
    private PlayerSpringDataRepository repo;

    public List<Player> getAllPlayers() {
        return repo.findAll();
    }

    public Player getPlayer(int id) {
        return findById(id);
    }

    public Player addPlayer(Player player) {
        return repo.save(player);
    }

    public Player updatePlayer(Player player) {
        return repo.save(player);
    }

    public Player patch(int id, Map<String, Object> playerPatch) {
        var player = findById(id);

        playerPatch.forEach( (key, value) -> {
            Field field = ReflectionUtils.findField(Player.class, key);
            ReflectionUtils.makeAccessible(field);
            ReflectionUtils.setField(field, player, value);
        });

        return repo.save(player);
    }

    @Transactional
    public void updateTitles(int id, int titles) {
        repo.updateTitles(id, titles);
    }

    private Player findById(int id) {
        var tempPlayer = repo.findById(id);

        if (tempPlayer.isEmpty())
            throw new RuntimeException("Player with id "+ id + " not found.");

        return tempPlayer.get();
    }
}
