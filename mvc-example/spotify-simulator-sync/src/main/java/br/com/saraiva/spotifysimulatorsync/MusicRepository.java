package br.com.saraiva.spotifysimulatorsync;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by sara on set, 2018
 */
public interface MusicRepository extends CrudRepository<Music, Integer> {
}
