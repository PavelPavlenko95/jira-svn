package by.pavelpavlenko.jira.rest.core.domain.meta;

import com.google.gson.annotations.Expose;
import by.pavelpavlenko.jira.rest.core.domain.IssuetypeBean;

public class IssueTypeMetaBean extends IssuetypeBean {

    @Expose
    private FieldsMetaBean fields;

    public FieldsMetaBean getFields() {
        return fields;
    }

    public void setFields(FieldsMetaBean fields) {
        this.fields = fields;
    }
}
