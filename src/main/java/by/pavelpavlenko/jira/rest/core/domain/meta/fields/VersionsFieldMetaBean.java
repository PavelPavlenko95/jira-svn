package by.pavelpavlenko.jira.rest.core.domain.meta.fields;

import com.google.gson.annotations.Expose;
import by.pavelpavlenko.jira.rest.core.domain.VersionBean;

import java.util.ArrayList;
import java.util.List;

public class VersionsFieldMetaBean extends FieldMetaBean {

    @Expose
    private List<VersionBean> allowedValues = new ArrayList<>();

    public List<VersionBean> getAllowedValues() {
        return allowedValues;
    }

    public void setAllowedValues(List<VersionBean> allowedValues) {
        this.allowedValues = allowedValues;
    }
}
