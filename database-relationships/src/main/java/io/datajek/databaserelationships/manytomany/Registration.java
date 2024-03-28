package io.datajek.databaserelationships.manytomany;

import jakarta.persistence.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,  CascadeType.REFRESH})
    @JoinColumn(name="player_id", referencedColumnName = "id")
    private Player player;

    public Registration() {
    }

    public Registration(Player player) {
        this.player = player;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Registration [id = " + id + "]";
    }
}
