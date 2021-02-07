package de.zettsystems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloDependencyInjection {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

    }

}