package de.zettsystems.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonData extends Data {
    private String name;

    public PersonData(DataIdGenerator dataIdGenerator) {
        super(dataIdGenerator);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "id='" + getId() + '\'' +
                "theData='" + getTheData() + '\'' +
                "name='" + this.name + '\'' +
                '}';
    }
}
