package de.zettsystems;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SpringInitPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof SpringInitService) {
			SpringInitService springInitService = (SpringInitService) bean;
			System.out.println("Message before postProcessBeforeInitialization is " + springInitService.getMessage());
			springInitService.setMessage("been postprocessedBeforeInit");
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization");
		if (bean instanceof SpringInitService) {
			((SpringInitService) bean).setMessage("been postprocessedAfterInit");
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
