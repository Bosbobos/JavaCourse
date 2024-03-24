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
        logger.info("Inserting Player: {}", repo.save(new Player("Djokovic", "Serbia",
                Date.valueOf("1987-05-22"), 81)));
        logger.info("Inserting Player: {}", repo.save(new Player("Monfils", "France",
                Date.valueOf("1986-09-01"), 10)));
        logger.info("Inserting Player: {}", repo.save(new Player("Thiem", "Austria",
                new Date(System.currentTimeMillis()), 17)));

        Player player3 = repo.findById(3).get();
        player3.setTitles(30);
        logger.info("Updating Player with Id 3: {}", player3);
        logger.info("All Players' Data: {}", repo.findAll());
        repo.deleteById(2);
        logger.info("All Players' Data: {}", repo.findAll());
        logger.info("French player: {}", repo.findByNationality("France"));
    }
}
