package de.zettsystems.domain;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class DataIdGenerator implements DataIdGeneratorIF {
    private AtomicLong sequence = new AtomicLong();

    public long getNextId() {
        return sequence.getAndIncrement();
    }
}
