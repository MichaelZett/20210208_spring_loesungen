package de.zettsystems.application;

import de.zettsystems.domain.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SetterBasedDataService {
	private static final Logger LOG = LoggerFactory.getLogger(SetterBasedDataService.class);
	private DataRepository dataRepository;

	// hier braucht man @Autowired
	@Autowired
	public void setDataRepository(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	@PostConstruct
	public void setup() {
		saveData("key", "value");
		LOG.info(dataRepository.getDataByKey("key").get());
	}

	public void saveData(String key, String value) {
		dataRepository.putData(key, value);
	}

}
