package de.zettsystems;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import de.zettsystems.domain.DataRepository;

@Configuration
@ComponentScan
public class SpringConfig {

	@Bean
	public DataRepository dataRepository() {
		return new DataRepository();
	}

	@Bean
	public DataRepository anotherDataRepository() {
		return new DataRepository();
	}
}