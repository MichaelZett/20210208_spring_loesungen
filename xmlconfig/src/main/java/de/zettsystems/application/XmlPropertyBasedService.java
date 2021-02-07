package de.zettsystems.application;

import de.zettsystems.domain.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlPropertyBasedService {
	private static final Logger LOG = LoggerFactory.getLogger(XmlPropertyBasedService.class);

	private DataRepository dataRepository;

	public DataRepository getDataRepository() {
		return dataRepository;
	}

	public void setDataRepository(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	public void setup() {
		dataRepository.putData("key", "Property");
		LOG.info(dataRepository.getDataByKey("key").get());
	}

}
