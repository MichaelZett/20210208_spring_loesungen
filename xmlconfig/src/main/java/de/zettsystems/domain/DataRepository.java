package de.zettsystems.domain;

import java.util.Optional;

public interface DataRepository {
    Optional<String> getDataByKey(String key);
    Optional<String> putData(String key, String value);
}
