package de.zettsystems;

import de.zettsystems.application.XmlConstructorBasedService;
import de.zettsystems.application.XmlFactoryBasedService;
import de.zettsystems.application.XmlPropertyBasedService;
import de.zettsystems.application.XmlStaticFactoryBasedService;
import de.zettsystems.expressions.SpelOperators;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigStarter {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        XmlPropertyBasedService propsService = applicationContext.getBean(XmlPropertyBasedService.class);
        propsService.setup();

        XmlConstructorBasedService conService = applicationContext.getBean(XmlConstructorBasedService.class);

        XmlStaticFactoryBasedService staticService = applicationContext.getBean(XmlStaticFactoryBasedService.class);
        staticService.setup();

        XmlFactoryBasedService factoryService = applicationContext.getBean(XmlFactoryBasedService.class);
        factoryService.setup();

        SpelOperators spelOperators = applicationContext.getBean(SpelOperators.class);
        System.out.println(spelOperators);

        applicationContext.registerShutdownHook();
    }

}