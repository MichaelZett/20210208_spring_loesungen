package de.zettsystems;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Eine Spring-Java-Config-Klasse.
 */
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorldService helloWorld() {
        return new HelloWorldService();
    }

    @Bean
    public SpringFanboyService fanboy() {
        return new SpringFanboyService();
    }
}