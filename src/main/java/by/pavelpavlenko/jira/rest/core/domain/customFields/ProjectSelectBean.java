package by.pavelpavlenko.jira.rest.core.domain.customFields;

import by.pavelpavlenko.jira.rest.core.domain.ProjectBean;

public class ProjectSelectBean extends CustomFieldBaseBean {

    private ProjectBean project;

    public ProjectBean getProject() {
        return project;
    }

    public void setProject(ProjectBean project) {
        this.project = project;
    }
}
