package io.datajek.databaserelationships.onetomany.bi.repository;

import io.datajek.databaserelationships.onetomany.bi.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Integer> {
}
