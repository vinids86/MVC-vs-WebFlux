package br.com.saraiva.spotifysimulatorsync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sara on set, 2018
 */
@RestController
public class MusicController {

    private final MusicRepository repository;

    @Autowired
    public MusicController(MusicRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/music")
    public @ResponseBody
    Iterable<Music> retrieveMusic() {
        return repository.findAll();
    }
}
