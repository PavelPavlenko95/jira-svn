package by.pavelpavlenko.jira.rest.core.domain.update;

import org.apache.commons.lang3.StringUtils;

public enum Operation {
    SET("set"),EDIT("edit"),REMOVE("remove");

    private String name;

    Operation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
