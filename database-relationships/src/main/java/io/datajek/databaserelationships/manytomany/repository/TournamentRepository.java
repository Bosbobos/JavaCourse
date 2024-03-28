package io.datajek.databaserelationships.manytomany.repository;

import io.datajek.databaserelationships.manytomany.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Integer> {
}
