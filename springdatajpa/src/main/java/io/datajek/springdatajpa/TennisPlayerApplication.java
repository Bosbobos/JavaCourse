//package io.datajek.springdatajpa;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.sql.Date;
//import java.time.LocalDate;
//
//
//@SpringBootApplication
//public class TennisPlayerApplication implements CommandLineRunner {
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	PlayerRepository repo;
//
////	public static void main(String[] args) {
////		SpringApplication.run(TennisPlayerApplication.class, args);
////	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		var player1 = new Player(
//				"Djokovic",
//				"Serbia",
//				Date.valueOf("1987-05-22"),
//				81);
//		var player2 = new Player(
//				"Monfils",
//				"France",
//				Date.valueOf(LocalDate.EPOCH),
//				10);
//
//		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(player1));
//
//		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(player2));
//
//		logger.info("\n\n>> Player with id 2: {}\n", repo.getPlayerById(2));
//
//		player2.setId(2);
//		player2.setBirthDate(Date.valueOf("1995-09-17"));
//
//		logger.info("\n\n>> Updating Player with Id 2: {}\n", repo.updatePlayer(player2));
//
//		logger.info("\n\n>> Player with id 2: {}\n", repo.getPlayerById(2));
//
//		logger.info("All Players' data: {}", repo.getAllPlayers());
//
//		repo.deleteById(1);
//
//		logger.info("All Players' data: {}", repo.getAllPlayers());
//	}
//}
