package br.com.saraiva.postmusic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static br.com.saraiva.postmusic.Pipe.apply;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.notFound;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Created by sara on set, 2018
 */
@Component
public class PostHandler {

    private final FacebookService facebookService;
    private final SpotifyService spotifyService;

    @Autowired
    public PostHandler(FacebookService facebookService, SpotifyService spotifyService) {
        this.facebookService = facebookService;
        this.spotifyService = spotifyService;
    }

    @NonNull
    Mono<ServerResponse> postMusic(ServerRequest request) {

        final Flux<String> flux = apply(spotifyService.getSongs())
                .pipe(spotifyService::normalize)
                .pipe(facebookService::post)
                .result().map(s -> "Post \"" + s + "\" on Facebook\n");

        return ok().contentType(APPLICATION_JSON).body(flux, String.class)
                .switchIfEmpty(notFound().build());
    }
}
