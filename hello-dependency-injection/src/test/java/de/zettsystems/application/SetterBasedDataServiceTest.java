package de.zettsystems.application;

import de.zettsystems.domain.DataRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SetterBasedDataServiceTest {
    @Mock
    DataRepository dataRepository;

    // Hier kann der Mock in die Setter-Methode gesteckt werden
    @InjectMocks
    ConstructorBasedDataService testee;

    @Test
    void saveData() {
        testee.saveData("key", "value");

        verify(dataRepository).putData("key", "value");
    }
}