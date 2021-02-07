package de.zettsystems.application;

import de.zettsystems.domain.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ConstructorBasedDataService {
	private static final Logger LOG = LoggerFactory.getLogger(ConstructorBasedDataService.class);
	private final DataRepository dataRepository;

	// hier braucht man kein @Autowired - wenn es nur einen public Constructor gibt
	public ConstructorBasedDataService(DataRepository dataRepository) {
		super();
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
