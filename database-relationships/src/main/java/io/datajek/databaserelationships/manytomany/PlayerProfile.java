package io.datajek.databaserelationships.manytomany;

import jakarta.persistence.*;

@Entity
public class PlayerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String twitter;

    @OneToOne(mappedBy= "playerProfile", cascade= CascadeType.ALL)
    private Player player;

    public PlayerProfile() {
    }

    public PlayerProfile(String twitter) {
        super();
        this.twitter = twitter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "PlayerDetail [id=" + id + ", twitter=" + twitter + ", player=" + player + "]";
    }
}