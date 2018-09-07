package br.com.saraiva.service;

import org.junit.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
import reactor.test.publisher.PublisherProbe;
import reactor.test.publisher.TestPublisher;
import reactor.test.publisher.TestPublisher.Violation;

import java.util.Arrays;

/**
 * Created by sara on set, 2018
 */
public class FacebookSubscriberTest {

    private final FacebookSubscriber facebookSubscriber = new FacebookSubscriber();

    @Test
    public void onSubscribe() {

        final TestPublisher<String> publisher = TestPublisher.create();

        final Flux<String> pub = Flux.fromIterable(Arrays.asList("Vinícius", "Dias", "Saraiva"));

//        pub.subscribe(facebookSubscriber);

        publisher.next("Vinícius", "Dias", "Saraiva").next("Alo alo").error(new Exception()).flux().subscribe(new Subscriber<String>() {

            private Subscription subscription;

            @Override
            public void onSubscribe(Subscription subscription) {
                System.out.println("onSubscribe");
                this.subscription = subscription;
                subscription.request(Long.MAX_VALUE);
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext");
                subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        });

//        StepVerifier.create(publisher)
//                .then(() -> publisher.emit("AIC", "DOWN"))
//                .expectNext("AIC")
//                .expectNext("DOWN")
//                .verifyComplete();
    }

    @Test
    public void misbehavingAllowsNull() {
        TestPublisher<String> publisher = TestPublisher.createNoncompliant(Violation.ALLOW_NULL);

        StepVerifier.create(publisher)
                .then(() -> publisher.emit("foo", null))
                .expectNext("foo", null)
                .expectComplete()
                .verify();
    }

//    @Test
//    public void normalDisallowsNull() {
//        TestPublisher<String> publisher = TestPublisher.create();
//
//        assertThatExceptionOfType(NullPointerException.class)
//                .isThrownBy(() -> publisher.next(null))
//                .withMessage("emitted values must be non-null");
//    }

    @Test
    public void testPublisherHangsAtVerifyComplete() {
        PublisherProbe<Void> publisher = TestPublisher.create();

        StepVerifier.create(publisher.mono())
                .verifyComplete();

        publisher.assertWasSubscribed();
    }

    @Test
    public void onNext() {
    }

    @Test
    public void onError() {
    }

    @Test
    public void onComplete() {
    }
}