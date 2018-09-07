package br.com.saraiva.postmusic;

/**
 * Created by sara on set, 2018
 */

import java.util.function.BiFunction;
import java.util.function.Function;

public class Pipe<A> {

    public final A a;

    private Pipe(A a) {
        this.a = a;
    }

    public static <A> Pipe<A> apply(A a) {
        return new Pipe<A>(a);
    }

    public <R> Pipe<R> pipe(Function<A, R> f) {
        return new Pipe<R>(f.apply(a));
    }

    public <R, B> Pipe<R> pipe(BiFunction<A, B, R> f, B b) {
        return new Pipe<R>(f.apply(a, b));
    }

    public A result() {
        return a;
    }

}
