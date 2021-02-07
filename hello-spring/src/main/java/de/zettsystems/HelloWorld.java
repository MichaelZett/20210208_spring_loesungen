package de.zettsystems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Die einfachste Spring-Anwendung.
 */
public class HelloWorld {

	public static void main(String[] args) {


		//ApplicationContext starten. Config könnte auch aus xml kommen.
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorldService helloWorldService = ctx.getBean(HelloWorldService.class);
		System.out.println(helloWorldService.sayHello());

		SpringFanboyService fanboy = ctx.getBean("fanboy", SpringFanboyService.class);
		System.out.println(fanboy.saySomething());

	}

}