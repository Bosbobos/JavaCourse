package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;


@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerDao dao;

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var allPlayers = dao.getAllPlayers();
		logger.info("All players data: {}", allPlayers);

		var player4 = new Player(
				4,
				"Nikolay",
				"Russia",
				new Date(System.currentTimeMillis()),
				17);
		logger.info("Inserting Player 4: {}", dao.insertPlayer(player4));
		var playerWithId4 = dao.getPlayerById(4);
		logger.info("Player with id 4: {}", playerWithId4);

		playerWithId4.setBirthDate(Date.valueOf("2000-09-17"));
		logger.info("Updating Player with Id 4: {}",
				dao.updatePlayer(playerWithId4));
		logger.info("Players with Id 4: {}", dao.getPlayerById(4));

		logger.info("Deleting player with id 2: {}", dao.deletePlayerById(2));
		var newAllPlayers = dao.getAllPlayers();
		logger.info("All players data: {}", newAllPlayers);
		dao.createTournamentTable();
	}
}
