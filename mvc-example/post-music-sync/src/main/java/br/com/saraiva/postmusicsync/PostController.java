package br.com.saraiva.postmusicsync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sara on set, 2018
 */
@RestController
public class PostController {

    private final FacebookService facebookService;
    private final SpotifyService spotifyService;

    @Autowired
    public PostController(FacebookService facebookService, SpotifyService spotifyService) {
        this.facebookService = facebookService;
        this.spotifyService = spotifyService;
    }

    @GetMapping(path = "/post", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<String>> postMusic() {

        final List<String> songs = spotifyService.normalize(spotifyService.getSongs());

        final List<String> posted = facebookService.post(songs).stream()
                .map(s -> "Post \"" + s + "\" on Facebook\n").collect(Collectors.toList());

        if (posted.isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(posted);
    }
}
