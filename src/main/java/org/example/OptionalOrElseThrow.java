package org.example;

import java.util.Optional;

public class OptionalOrElseThrow {

    public void orElseThrow() {
        Optional<Integer> i = Optional.of(1);
        Integer i2 = i.orElseThrow(RuntimeException::new);
        Integer i1 = i.orElseThrow();// since 10
    }
}
