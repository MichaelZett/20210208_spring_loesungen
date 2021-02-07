package de.zettsystems.application;

import de.zettsystems.domain.DataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConstructorBasedDataService extends ZettService {
    private static final Logger LOG = LoggerFactory.getLogger(ConstructorBasedDataService.class);
    private final DataRepository dataRepository;

    public ConstructorBasedDataService(DataRepository dataRepository) {
        super(ConstructorBasedDataService.class.getSimpleName());
        this.dataRepository = dataRepository;
    }

    public void saveData(String value, String name) {
        dataRepository.putData(value, name);
    }

    public void logAllData() {
        dataRepository.allData().forEach(d -> LOG.info(d.toString()));
    }

}
