package com.team.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import javax.annotation.PostConstruct;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class IndexedProblemApplication {

	@Autowired
	private PlayerRepository playerRepository;

	public static void main(String[] args) {
		SpringApplication.run(IndexedProblemApplication.class, args);
	}


	@PostConstruct
	public void seedData() {
		var player = new Player("Cristiano Ronaldo", "CR7");

		playerRepository.save(player).subscribe();

	}
}
