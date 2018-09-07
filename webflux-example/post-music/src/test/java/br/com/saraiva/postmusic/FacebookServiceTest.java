package br.com.saraiva.postmusic;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;

import static org.junit.Assert.*;

/**
 * Created by sara on set, 2018
 */
public class FacebookServiceTest {

    private final FacebookService service = new FacebookService();

    @Test
    public void post() {

        final String musicFormat = "Song: La Belle De Jour - Artist: Alçeu Valença - Genre: MPB";
        final Flux<String> music = Flux.just(musicFormat);

        StepVerifier.withVirtualTime(() -> service.post(music))
                .expectSubscription()
                .expectNoEvent(Duration.ofMillis(2000))
                .expectNext(musicFormat)
                .verifyComplete();
    }
}