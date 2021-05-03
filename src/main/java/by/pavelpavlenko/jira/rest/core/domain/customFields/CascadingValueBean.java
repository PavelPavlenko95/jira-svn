package by.pavelpavlenko.jira.rest.core.domain.customFields;

public class CascadingValueBean extends CustomFieldBaseBean {

    private ValueBean value;

    public ValueBean getValue() {
        return value;
    }

    public void setValue(ValueBean value) {
        this.value = value;
    }
}
