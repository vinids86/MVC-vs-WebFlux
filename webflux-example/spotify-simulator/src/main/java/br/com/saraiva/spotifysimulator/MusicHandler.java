package br.com.saraiva.spotifysimulator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Created by sara on set, 2018
 */
@Component
public class MusicHandler {

    private final MusicRepository repository;

    @Autowired
    public MusicHandler(MusicRepository repository) {
        this.repository = repository;
    }

    Mono<ServerResponse> retrieveMusic(ServerRequest request) {
        return ok().contentType(APPLICATION_JSON)
                .body(fromPublisher(repository.findAll(), Music.class));
    }

    Mono<ServerResponse> newMusicListended(ServerRequest request) {

        final Mono<Void> voidMono = request.bodyToMono(Music.class)
                .doOnNext(repository::save)
                .thenEmpty(Mono.empty());

        return ok().build(voidMono);
    }
}
