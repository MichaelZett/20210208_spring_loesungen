package de.zettsystems.application;

import de.zettsystems.domain.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlStaticFactoryBasedService {
	private static final Logger LOG = LoggerFactory.getLogger(XmlStaticFactoryBasedService.class);
	private final DataRepository dataRepository;

	public XmlStaticFactoryBasedService(DataRepository dataRepository) {
		super();
		this.dataRepository = dataRepository;
	}

	public void setup() {
		dataRepository.putData("key", "Constructor");
		LOG.info(dataRepository.getDataByKey("key").get());
	}

}
