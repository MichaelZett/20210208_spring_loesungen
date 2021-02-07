package de.zettsystems.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TheOtherService {
    private static final Logger LOG = LoggerFactory.getLogger(TheOtherService.class);
    private final String message;

    public TheOtherService(@Value("${call.message:default}") String message) {
        this.message = message;
    }

    public void callMe() {
        LOG.info(message);
    }
}
