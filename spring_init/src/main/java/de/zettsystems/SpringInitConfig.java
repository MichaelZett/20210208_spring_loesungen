package de.zettsystems;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringInitConfig {
	@Bean
	public SpringInitService springInitService() {
		SpringInitService springInitService = new SpringInitService();
		springInitService.setMessage("Hello");
		return springInitService;
	}

	@Bean
	public BeanPostProcessor springInitPostProcessor() {
		return new SpringInitPostProcessor();
	}
}