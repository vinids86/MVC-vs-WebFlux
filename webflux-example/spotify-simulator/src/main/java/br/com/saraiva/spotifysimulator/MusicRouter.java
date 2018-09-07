package br.com.saraiva.spotifysimulator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

/**
 * Created by sara on set, 2018
 */
@Configuration
public class MusicRouter {

    @Bean
    public RouterFunction<ServerResponse> routeMusic(MusicHandler handler) {
        return RouterFunctions.route(GET("/music").and(accept(APPLICATION_JSON)), handler::retrieveMusic);
    }
}
