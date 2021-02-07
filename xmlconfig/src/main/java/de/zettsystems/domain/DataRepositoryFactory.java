package de.zettsystems.domain;

import java.util.Optional;

public class DataRepositoryFactory {
    public DataRepository getRepository() {
        return new DataRepository() {
            @Override
            public Optional<String> getDataByKey(String key) {
                return Optional.of("Factory");
            }

            @Override
            public Optional<String> putData(String key, String value) {
                return Optional.empty();
            }
        };
    }
}