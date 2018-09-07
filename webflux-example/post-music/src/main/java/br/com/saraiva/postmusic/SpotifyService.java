package br.com.saraiva.postmusic;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * Created by sara on set, 2018
 */
@Service
class SpotifyService {

    Flux<Music> getSongs() {
        return WebClient.create("http://localhost:8090").get()
                .uri("/music").accept(APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Music.class);
    }

    Flux<String> normalize(Flux<Music> songs) {
        return songs.filter(s -> !s.getGenre().equals("Funk"))
                .map(s -> "Song: " + s.getName() + " - Artist: " + s.getArtist() + " - Genre: " + s.getGenre());
    }
}
