package de.zettsystems.monitoring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("theSpringBeanLogMonitoringService")
public class MonitoringService {
	private static final Logger LOG = LoggerFactory.getLogger(MonitoringService.class);
	private final ApplicationContext applicationContext;

	public MonitoringService(ApplicationContext applicationContext) {
		super();
		this.applicationContext = applicationContext;
	}

	@PostConstruct
	public void logBeans() {
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : allBeanNames) {
			LOG.info(beanName);
		}
	}
}
