package io.datajek.databaserelationships.onetoone.service;

import io.datajek.databaserelationships.onetoone.PlayerProfile;
import io.datajek.databaserelationships.onetoone.repository.PlayerProfileRepository;
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
