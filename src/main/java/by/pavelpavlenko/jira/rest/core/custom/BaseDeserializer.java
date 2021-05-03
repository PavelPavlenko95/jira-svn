package by.pavelpavlenko.jira.rest.core.custom;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import by.pavelpavlenko.jira.rest.JiraRestClient;
import by.pavelpavlenko.jira.rest.core.domain.customFields.CustomFieldType;
import by.pavelpavlenko.jira.rest.core.domain.field.FieldBean;


public abstract class BaseDeserializer {

    protected final Gson gson = new GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create();

    protected CustomFieldType getCustomFieldType(String customFieldId) {
        FieldBean fieldBean = JiraRestClient.getCustomfields().get(customFieldId);
        if(fieldBean == null){
            return null;
        }
        String custom = fieldBean.getSchema().getCustom();
        if (custom == null) {
            return null;
        }
        CustomFieldType[] values = CustomFieldType.values();
        for (CustomFieldType value : values) {
            if (custom.equals(value.getJiraName()) == true) {
                return value;
            }
        }
        return null;
    }
}
