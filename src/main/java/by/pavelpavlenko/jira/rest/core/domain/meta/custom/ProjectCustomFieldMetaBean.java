package by.pavelpavlenko.jira.rest.core.domain.meta.custom;

import by.pavelpavlenko.jira.rest.core.domain.ProjectBean;
import by.pavelpavlenko.jira.rest.core.domain.meta.fields.FieldMetaBean;

import java.util.ArrayList;
import java.util.List;

public class ProjectCustomFieldMetaBean extends FieldMetaBean{

    private List<ProjectBean> allowedValues = new ArrayList<>();

    public ProjectCustomFieldMetaBean(FieldMetaBean fieldMetaBean) {
        super(fieldMetaBean);
    }

    public List<ProjectBean> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<ProjectBean> allowedValues) {
        this.allowedValues = allowedValues;
    }
}
