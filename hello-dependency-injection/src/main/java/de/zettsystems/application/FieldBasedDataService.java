package de.zettsystems.application;

import de.zettsystems.domain.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class FieldBasedDataService {
	private static final Logger LOG = LoggerFactory.getLogger(FieldBasedDataService.class);
	// hier braucht man @Autowired
	@Autowired
	private DataRepository dataRepository;

	@PostConstruct
	public void setup() {
		saveData("key", "value");
		LOG.info(dataRepository.getDataByKey("key").get());
	}

	public void saveData(String key, String value) {
		dataRepository.putData(key, value);
	}

}
