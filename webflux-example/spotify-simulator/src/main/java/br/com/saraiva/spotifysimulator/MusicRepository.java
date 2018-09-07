package br.com.saraiva.spotifysimulator;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by sara on set, 2018
 */
interface MusicRepository extends ReactiveMongoRepository<Music, String> {

}
