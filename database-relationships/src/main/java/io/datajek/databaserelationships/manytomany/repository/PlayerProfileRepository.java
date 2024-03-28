package io.datajek.databaserelationships.manytomany.repository;

import io.datajek.databaserelationships.manytomany.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {
}
