package io.datajek.springdatajpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional // Usually used on business level
public class PlayerRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<Player> getAllPlayers() {
        TypedQuery<Player> getAll = entityManager.createNamedQuery(
                "get_all_players",
                Player.class
        );
        return getAll.getResultList();
    }

    /**
     * Inserts a player into a DB
     * @param player has to have no Id as it will be created
     */
    public Player insertPlayer(Player player)
    {
        return entityManager.merge(player);
    }

    /**
     * Updates a player record in a DB
     * @param player has to have an Id
     */
    public Player updatePlayer(Player player)
    {
        return entityManager.merge(player);
    }

    public Player getPlayerById(int id) {
        return entityManager.find(Player.class, id);
    }

    public void deleteById(int id) {
        var player = entityManager.find(Player.class, id);
        entityManager.remove(player);
    }
}
