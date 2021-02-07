package de.zettsystems.application;

import de.zettsystems.domain.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlFactoryBasedService {
	private static final Logger LOG = LoggerFactory.getLogger(XmlFactoryBasedService.class);
	private final DataRepository dataRepository;

	public XmlFactoryBasedService(DataRepository dataRepository) {
		super();
		this.dataRepository = dataRepository;
	}

	public void setup() {
		dataRepository.putData("key", "Constructor");
		LOG.info(dataRepository.getDataByKey("key").get());
	}

}
