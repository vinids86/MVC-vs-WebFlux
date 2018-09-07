package br.com.saraiva.spotifysimulatorsync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpotifySimulatorSyncApplication implements CommandLineRunner {

	@Autowired
	private MusicRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpotifySimulatorSyncApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		repository.save(new Music("Walk", "Pantera", "Trash"));
		repository.save(new Music("Sea of Sorrow", "Alice in Chains", "Grunge"));
		repository.save(new Music("Elevated Man", "Goatsnake", "Stoner"));
		repository.save(new Music("Spoonman", "Soundgarden", "Grunge"));
		repository.save(new Music("With Eyes Wide Open", "Greenleaf", "Stoner"));
		repository.save(new Music("Amor de Verdade", "MC Kekel", "Funk"));
		repository.save(new Music("Crystal Spiders", "Uncle Acid & The Deadbeats", "Stoner"));
		repository.save(new Music("Space Cadet", "Kyuss", "Stoner"));
	}
}
