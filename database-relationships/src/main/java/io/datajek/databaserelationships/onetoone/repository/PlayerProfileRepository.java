package io.datajek.databaserelationships.onetoone.repository;

import io.datajek.databaserelationships.onetoone.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {
}
