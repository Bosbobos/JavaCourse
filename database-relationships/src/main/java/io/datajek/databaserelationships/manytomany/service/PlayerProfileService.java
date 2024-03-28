package io.datajek.databaserelationships.manytomany.service;

import io.datajek.databaserelationships.manytomany.PlayerProfile;
import io.datajek.databaserelationships.manytomany.repository.PlayerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerProfileService {
    @Autowired
    PlayerProfileRepository repo;

    public PlayerProfile getPlayerProfile(int id){
        return repo.findById(id).get();
    }
}
