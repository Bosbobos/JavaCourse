package io.datajek.databaserelationships.manytomany.controller;

import io.datajek.databaserelationships.manytomany.Player;
import io.datajek.databaserelationships.manytomany.Registration;
import io.datajek.databaserelationships.manytomany.service.PlayerProfileService;
import io.datajek.databaserelationships.manytomany.service.PlayerService;
import io.datajek.databaserelationships.manytomany.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    PlayerService service;
    @Autowired
    PlayerProfileService profileService;
    @Autowired
    RegistrationService registrationService;
    @PutMapping("/{id}/profiles/{profile_id}")
    public Player assignDetail(@PathVariable int id, @PathVariable int profile_id) {
        var playerProfile = profileService.getPlayerProfile(profile_id);
        return service.assignProfile(id, playerProfile);
    }

    @PutMapping("/{id}/registrations/{registration_id}")
    public Player assignRegistration(@PathVariable int id, @PathVariable int registration_id) {
        Registration registration = registrationService.getRegistration(registration_id);
        return service.assignRegistration(id, registration);
    }
}
