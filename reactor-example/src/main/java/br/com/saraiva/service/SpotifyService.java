package br.com.saraiva.service;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sara on set, 2018
 */
public class SpotifyService {

    private List<String> songs = Arrays.asList(
            "Walk - Pantera - Trash",
            "Sea Of Sorrow - Alice in Chains - Grunge",
            "Elevated Man - Goatsnake - Stoner",
            "Spoonman - Soundgarden - Grunge",
            "With Eyes Wide Open - Greenleaf - Stoner",
            "Amor de Verdade - MC Kekel - Funk",
            "Crystal Spiders - Uncle Acid & The Deadbeats - Stoner",
            "Space Cadet - Kyuss - Stoner");

    public Flux<String> getSongs() {
        return generate().map(this::normalize).filter(song -> !song.contains("Genre: Funk"));
    }

    private String normalize(String song) {
        final String[] songArtist = song.split("\\s*-\\s*");
        return "Song: " + songArtist[0] + " - Artist: " + songArtist[1] + " - Genre: " + songArtist[2];
    }

    private Flux<String> generate() {
//        return Flux.fromIterable(songs);
        return Flux.generate(
                () -> 0,
                (state, sink) -> {
                    sink.next(songs.get(state));
                    if (state == songs.size() - 1) sink.complete();
                    return state + 1;
                }
        );
    }
}
