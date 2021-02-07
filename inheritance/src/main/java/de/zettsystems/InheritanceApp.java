package de.zettsystems;

import de.zettsystems.application.ConstructorBasedDataService;
import de.zettsystems.domain.SomeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class InheritanceApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        String[] beanNamesForType = ctx.getBeanNamesForType(SomeRepository.class);
        Arrays.stream(beanNamesForType).forEach(System.out::println);

        ConstructorBasedDataService bean = ctx.getBean(ConstructorBasedDataService.class);
        System.out.println("Welche property: " + bean.getName());
        bean.callTheOtherService();

        bean.saveData("eineBean", "Peter");
        bean.saveData("eineZweiteBean", "Fred");
        bean.logAllData();
    }

}