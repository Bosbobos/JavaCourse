package io.datajek.databaserelationships.onetomany.bi.service;

import io.datajek.databaserelationships.onetomany.bi.PlayerProfile;
import io.datajek.databaserelationships.onetomany.bi.repository.PlayerProfileRepository;
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
