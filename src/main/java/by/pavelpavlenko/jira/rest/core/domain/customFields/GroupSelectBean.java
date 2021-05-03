package by.pavelpavlenko.jira.rest.core.domain.customFields;

import java.util.ArrayList;
import java.util.List;

public class GroupSelectBean extends CustomFieldBaseBean {

    private List<ValueBean> groups;

    public List<ValueBean> getGroups() {
        if(groups == null){
            groups = new ArrayList<>();
        }
        return groups;
    }

    public void setGroups(List<ValueBean> groups) {
        this.groups = groups;
    }
}
