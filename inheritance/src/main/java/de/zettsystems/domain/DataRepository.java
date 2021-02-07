package de.zettsystems.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class DataRepository {
	private final BeanFactory beanFactory;
	private final Map<Long, PersonData> repo = new ConcurrentHashMap<>();

	public DataRepository(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

	public Collection<PersonData> allData() {
		return repo.values();
	}

	public Optional<PersonData> putData(String value, String name) {
		final PersonData data = createData(value, name);
		return Optional.ofNullable(repo.put(data.getId(), data));
	}

	private PersonData createData(String value, String name) {
		final PersonData bean = beanFactory.getBean(PersonData.class);
		bean.setTheData(value);
		bean.setName(name);
		return bean;
	}
}
