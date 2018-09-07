package br.com.saraiva.service;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * Created by sara on set, 2018
 */
public class FacebookSubscriber implements Subscriber<String> {

    private Subscription subscription;
    private FacebookService service;

    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        this.service = new FacebookService();
        subscription.request(1);
    }

    public void onNext(String song) {
        service.post(song);
        this.subscription.request(1);
    }

    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    public void onComplete() {
        System.out.println("No more songs =(");
    }
}
