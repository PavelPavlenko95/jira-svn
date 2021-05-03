package by.pavelpavlenko.jira.rest.core.domain.customFields;

import by.pavelpavlenko.jira.rest.core.domain.BaseBean;

public class CustomFieldBaseBean extends BaseBean {

    private CustomFieldType type;

    public CustomFieldType getType() {
        return type;
    }

    public void setType(CustomFieldType type) {
        this.type = type;
    }
}
