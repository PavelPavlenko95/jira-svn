package by.pavelpavlenko.jira.rest.core.domain.meta.custom;

import by.pavelpavlenko.jira.rest.core.domain.VersionBean;
import by.pavelpavlenko.jira.rest.core.domain.meta.fields.FieldMetaBean;

import java.util.ArrayList;
import java.util.List;

public class VersionCustomFieldMetaBean extends FieldMetaBean {

    private List<VersionBean> allowedValues = new ArrayList<>();

    public VersionCustomFieldMetaBean(FieldMetaBean fieldMetaBean) {
        super(fieldMetaBean);
    }

    public List<VersionBean> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<VersionBean> allowedValues) {
        this.allowedValues = allowedValues;
    }
}
