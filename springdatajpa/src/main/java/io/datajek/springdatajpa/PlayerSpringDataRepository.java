package io.datajek.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerSpringDataRepository extends JpaRepository<Player, Integer> {
    public List<Player> findByNationality(String nationality); // turns into select p from Player p where p.nationality = ?
    // And, Or, GreaterThan, LessThan, Like, IsNull, Not, ... can be used as well as OrderBy
}
