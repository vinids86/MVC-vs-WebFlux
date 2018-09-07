package br.com.saraiva.spotifysimulator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpotifySimulatorApplication implements CommandLineRunner {

    @Autowired
    private MusicRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpotifySimulatorApplication.class, args);
    }

    @Override
    public void run(String... args) {

        repository.deleteAll()
                .then(repository.save(new Music("Walk", "Pantera", "Trash")))
                .then(repository.save(new Music("Sea of Sorrow", "Alice in Chains", "Grunge")))
                .then(repository.save(new Music("Elevated Man", "Goatsnake", "Stoner")))
                .then(repository.save(new Music("Spoonman", "Soundgarden", "Grunge")))
                .then(repository.save(new Music("With Eyes Wide Open", "Greenleaf", "Stoner")))
                .then(repository.save(new Music("Amor de Verdade", "MC Kekel", "Funk")))
                .then(repository.save(new Music("Crystal Spiders", "Uncle Acid & The Deadbeats", "Stoner")))
                .then(repository.save(new Music("Space Cadet", "Kyuss", "Stoner")))
                .subscribe();
    }
}
