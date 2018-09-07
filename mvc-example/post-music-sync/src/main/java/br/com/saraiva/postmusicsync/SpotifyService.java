package br.com.saraiva.postmusicsync;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sara on set, 2018
 */
@Service
class SpotifyService {

    List<Music> getSongs() {
        final RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(
                "http://localhost:8080/music",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Music>>() {})
                .getBody();
    }

    List<String> normalize(List<Music> songs) {
        return songs.stream()
                .filter(s -> !s.getGenre().equals("Funk"))
                .map(s -> "Song: " + s.getName() + " - Artist: " + s.getArtist() + " - Genre: " + s.getGenre())
                .collect(Collectors.toList());
    }
}
