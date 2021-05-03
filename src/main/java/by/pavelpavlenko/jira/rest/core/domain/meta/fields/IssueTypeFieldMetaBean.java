package by.pavelpavlenko.jira.rest.core.domain.meta.fields;

import com.google.gson.annotations.Expose;
import by.pavelpavlenko.jira.rest.core.domain.IssuetypeBean;

import java.util.ArrayList;
import java.util.List;


public class IssueTypeFieldMetaBean extends FieldMetaBean {

    @Expose
    private List<IssuetypeBean> allowedValues = new ArrayList<>();

    public List<IssuetypeBean> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<IssuetypeBean> allowedValues) {
        this.allowedValues = allowedValues;
    }
}
