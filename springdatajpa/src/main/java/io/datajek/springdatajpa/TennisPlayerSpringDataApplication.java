package io.datajek.springdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class TennisPlayerSpringDataApplication implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(TennisPlayerSpringDataApplication.class);
    @Autowired
    PlayerSpringDataRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(TennisPlayerSpringDataApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        var player1 = new Player("Sasha",
                "Russian",
                Date.valueOf("2005-09-17"),
                18);
        var player2 = new Player("Monfils",
                "France",
                Date.valueOf("1986-01-09"),
                10);
        var player3 = new Player("Smith",
                "UK",
                Date.valueOf("1976-10-02"),
                20);
        repo.save(player1);
        repo.save(player2);
        repo.save(player3);
    }
}
