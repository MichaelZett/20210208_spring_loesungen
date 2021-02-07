package de.zettsystems;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringInit {

	public static void main(String[] args) {
		// ConfigurableApplicationContext für die Lifecycle Methoden
		try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(SpringInitConfig.class)) {

			SpringInitService springInitService = ctx.getBean(SpringInitService.class);
			System.out.println("Message in main is " + springInitService.getMessage());
		}
	}

}