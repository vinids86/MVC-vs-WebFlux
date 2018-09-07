package br.com.saraiva.postmusic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

/**
 * Created by sara on set, 2018
 */
@Configuration
public class PostRouter {

    @Bean
    public RouterFunction<ServerResponse> routePost(PostHandler handler) {
        return RouterFunctions.route(GET("/post").and(accept(APPLICATION_JSON)), handler::postMusic);
    }
}
