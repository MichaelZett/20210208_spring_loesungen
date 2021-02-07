package de.zettsystems.adapter;

import de.zettsystems.application.BestPracticeService;
import de.zettsystems.application.ConstructorBasedDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BestPracticeAdapter {
    private static final Logger LOG = LoggerFactory.getLogger(BestPracticeAdapter.class);
    private final BestPracticeService bestPracticeService;
    private final ConstructorBasedDataService constructorBasedDataService;

    public BestPracticeAdapter(BestPracticeService bestPracticeService, ConstructorBasedDataService constructorBasedDataService) {
        this.bestPracticeService = bestPracticeService;
        this.constructorBasedDataService = constructorBasedDataService;
    }

    @PostConstruct
    public void testInstances() {
        boolean isInstance = bestPracticeService instanceof BestPracticeService;
        LOG.info("BestPracticeService instanceof: " + isInstance);

        // Noch ist es egal, dass eine Klasse und kein Interface genutzt wird,
        // Spring muss keinen Proxy benutzen, da keine Spezialfähigkeiten gebraucht werden
        isInstance = constructorBasedDataService instanceof ConstructorBasedDataService;
        LOG.info("ConstructorBasedDataService instanceof: " + isInstance);
    }
}
