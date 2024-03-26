package io.datajek.databaserelationships;

import io.datajek.databaserelationships.onetoone.Player;
import io.datajek.databaserelationships.onetoone.repository.PlayerProfileRepository;
import io.datajek.databaserelationships.onetoone.repository.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class DatabaseRelationshipsApplication implements CommandLineRunner {
	PlayerRepository playerRepo;
	PlayerProfileRepository playerProfileRepo;
	public static void main(String[] args) {
		SpringApplication.run(DatabaseRelationshipsApplication.class, args);
	}

	public void run(String... args) throws Exception {
	}
}
