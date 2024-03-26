package io.datajek.databaserelationships.onetoone.controller;

import io.datajek.databaserelationships.onetoone.Player;
import io.datajek.databaserelationships.onetoone.service.PlayerProfileService;
import io.datajek.databaserelationships.onetoone.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class PlayerController {
    @Autowired
    PlayerService service;
    @Autowired
    PlayerProfileService profileService;
    @PutMapping("/{id}/profiles/{profile_id}")
    public Player assignDetail(@PathVariable int id, @PathVariable int profile_id) {
        var playerProfile = profileService.getPlayerProfile(profile_id);
        return service.assignProfile(id, playerProfile);
    }
}
