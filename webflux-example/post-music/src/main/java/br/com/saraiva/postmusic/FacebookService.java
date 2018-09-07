package br.com.saraiva.postmusic;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * Created by sara on set, 2018
 */
@Service
class FacebookService {

    Flux<String> post(Flux<String> songs) {
        return songs.delaySubscription(Duration.ofMillis(2000));
    }
}
