package br.com.saraiva.postmusic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Created by sara on set, 2018
 */
@RestController
public class PostController {

    private final SpotifyService service;

    @Autowired
    public PostController(SpotifyService service) {
        this.service = service;
    }

    @GetMapping(value = "/stream/musics", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<String> streamPlayedMusics() {
        return Flux.empty();//;service.getSongs();
    }
}
