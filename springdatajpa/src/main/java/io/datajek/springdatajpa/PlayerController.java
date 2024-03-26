package io.datajek.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Tennis player REST API";
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return service.getAllPlayers();
    }

    @GetMapping("/players/{id}")
    public Player getPlayer(@PathVariable int id) {
        return service.getPlayer(id);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        player.setId(0);
        return service.addPlayer(player);
    }

    @PutMapping("/players/{id}")
    public Player updatePlayer(@PathVariable int id,
                               @RequestBody Player player) {
        player.setId(id);
        return service.updatePlayer(player);
    }

    @PatchMapping("/players/{id}")
    public Player partialUpdate(@PathVariable int id,
                                @RequestBody Map<String, Object> playerPatch) {
        return service.patch(id, playerPatch);
    }

    @PatchMapping("/players/{id}/titles")
    public void updateTitles(@PathVariable int id, @RequestBody int titles) {
        service.updateTitles(id, titles);
    }

    @DeleteMapping("/players/{id}")
    public String deletePlayer(@PathVariable int id) {
        return service.deletePlayer(id);
    }
}
