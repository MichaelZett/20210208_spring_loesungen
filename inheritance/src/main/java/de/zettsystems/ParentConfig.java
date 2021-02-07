package de.zettsystems;

import de.zettsystems.domain.SomeRepository;
import org.springframework.context.annotation.Bean;

public class ParentConfig {

    @Bean
    public SomeRepository firstSomeRepository() {
        return new SomeRepository();
    }
}
