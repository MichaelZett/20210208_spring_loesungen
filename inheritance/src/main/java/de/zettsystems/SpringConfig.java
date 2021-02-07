package de.zettsystems;

import de.zettsystems.domain.SomeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class SpringConfig extends ParentConfig {

	@Bean
	public SomeRepository someRepository() {
		return new SomeRepository();
	}

}