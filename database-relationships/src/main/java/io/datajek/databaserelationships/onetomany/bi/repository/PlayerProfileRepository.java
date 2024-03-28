package io.datajek.databaserelationships.onetomany.bi.repository;

import io.datajek.databaserelationships.onetomany.bi.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {
}
