package br.com.saraiva.postmusic;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

/**
 * Created by sara on set, 2018
 */
public class SpotifyServiceTest {

    private final SpotifyService service = new SpotifyService();

    @Test
    public void givenASong_whenGenreIsNotAFunk_thenNextIsCall() {

        final Flux<Music> songs = Flux.just(new Music("Mistério do Planeta", "Novos Baianos", "MPB"));
        StepVerifier.create(service.normalize(songs))
                .expectNext("Song: Mistério do Planeta - Artist: Novos Baianos - Genre: MPB")
                .verifyComplete();
    }

    @Test
    public void givenASong_whenGenreIsFunk_thenNextIsNotCall() {

        final Flux<Music> songs = Flux.just(new Music("Ta Tum Tum", "MC Kevinho", "Funk"));
        StepVerifier.create(service.normalize(songs))
                .verifyComplete();
    }

    @Test
    public void givenNull_thenErrorIsCall() {

        final Flux<Music> just = Flux.just(new Music());
        StepVerifier.create(service.normalize(just))
                .expectError(NullPointerException.class);
    }

}