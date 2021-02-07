package de.zettsystems.domain;

import java.util.Optional;

public class StaticDataRepositoryFactory {
    public static DataRepository getRepository() {
        return new DataRepository() {
            @Override
            public Optional<String> getDataByKey(String key) {
                return Optional.of("Static Factory");
            }

            @Override
            public Optional<String> putData(String key, String value) {
                return Optional.empty();
            }
        };
    }
}