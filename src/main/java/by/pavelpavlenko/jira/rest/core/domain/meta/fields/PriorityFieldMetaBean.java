package by.pavelpavlenko.jira.rest.core.domain.meta.fields;

import com.google.gson.annotations.Expose;
import by.pavelpavlenko.jira.rest.core.domain.PriorityBean;

import java.util.ArrayList;
import java.util.List;


public class PriorityFieldMetaBean extends FieldMetaBean {

    @Expose
    private List<PriorityBean> allowedValues = new ArrayList<>();

    public List<PriorityBean> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<PriorityBean> allowedValues) {
        this.allowedValues = allowedValues;
    }
}
