package br.com.saraiva.postmusicsync;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sara on set, 2018
 */
@Service
class FacebookService {

    List<String> post(List<String> songs) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return songs;
    }
}
