package br.com.saraiva;

import br.com.saraiva.service.FacebookSubscriber;
import br.com.saraiva.service.SpotifyService;
import reactor.core.publisher.Flux;

/**
 * Created by sara on set, 2018
 */
public class Application {

    public static void main(String... args) {

        final SpotifyService service = new SpotifyService();
        final FacebookSubscriber facebookSubscriber = new FacebookSubscriber();

        final Flux<String> songs = service.getSongs().log();

        System.out.println("Get songs on the Spotify? Nothing happens until you subscribe!");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        songs.subscribe(facebookSubscriber);
    }

}
