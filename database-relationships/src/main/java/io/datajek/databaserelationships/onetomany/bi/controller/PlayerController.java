package io.datajek.databaserelationships.onetomany.bi.controller;

import io.datajek.databaserelationships.onetomany.bi.*;
import io.datajek.databaserelationships.onetomany.bi.service.*;
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
