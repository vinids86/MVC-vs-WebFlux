package br.com.saraiva.service;

import org.junit.Test;
import reactor.test.StepVerifier;
import reactor.test.publisher.TestPublisher;

/**
 * Created by sara on set, 2018
 */
public class SpotifyServiceTest {

    private final SpotifyService service = new SpotifyService();

    @Test
    public void getSongs() {
        StepVerifier.create(
                service.getSongs())
                .expectNext("Song: Walk - Artist: Pantera - Genre: Trash")
                .expectNext("Song: Sea Of Sorrow - Artist: Alice in Chains - Genre: Grunge")
                .expectNext("Song: Elevated Man - Artist: Goatsnake - Genre: Stoner")
                .expectNext("Song: Spoonman - Artist: Soundgarden - Genre: Grunge")
                .expectNext("Song: With Eyes Wide Open - Artist: Greenleaf - Genre: Stoner")
                .expectNext("Song: Crystal Spiders - Artist: Uncle Acid & The Deadbeats - Genre: Stoner")
                .expectNext("Song: Space Cadet - Artist: Kyuss - Genre: Stoner")
                .verifyComplete();
    }
}