package by.pavelpavlenko.jira.rest;

import by.pavelpavlenko.jira.rest.JiraRestClient;
import by.pavelpavlenko.jira.rest.core.domain.*;
import by.pavelpavlenko.jira.rest.core.misc.JsonConstants;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Start {

    static final String CONFIGFILENAME = "config.properties";

    static final String URL_PARAM = "http://paveligrotek.atlassian.net/jira";
    static final String LOGIN_PARAM = "pavel.igrotek@gmail.com";
    static final String PASSWORD_PARAM = "Pavlenko1234";

    public static void main(String[] args) throws URISyntaxException, ExecutionException, InterruptedException, IOException {
        String login = "pavel.igrotek@gmail.com";
        String password = "Pavlenko1234";
        String testSystemUrl = "http://paveligrotek.atlassian.net/jira";

        ExecutorService executorService = Executors.newFixedThreadPool(100);
        JiraRestClient jiraRestClient = new JiraRestClient(executorService);
        URI uri = new URI("http://paveligrotek.atlassian.net/jira");
        jiraRestClient.connect(uri, login, password);
        System.out.println("connected");
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        Properties config = new Properties();
        config.load(new FileInputStream(path + CONFIGFILENAME));
        testSystemUrl = config.getProperty(URL_PARAM);
        login = config.getProperty(LOGIN_PARAM);
        password = config.getProperty(PASSWORD_PARAM);

//        IssueBean issue = new IssueBean();
//        FieldsBean fields = new FieldsBean();
//        fields.setDescription("Test Description");
//        fields.setSummary("Test Title");
//        ProjectBean project = new ProjectBean();
//        project.setKey("DEMO");
//        fields.setProject(project);
//        IssuetypeBean issueType = new IssuetypeBean();
//        issueType.setName("Bug");
//        fields.setIssuetype(issueType);
//        PriorityBean priority = new PriorityBean();
//        priority.setName(JsonConstants.PRIORITY_MAJOR);
//        fields.setPriority(priority);
//        fields.setDuedate("2022-08-01");
//
//        List<ComponentBean> componentBeen = new ArrayList<>();
//        ComponentBean componentBean1 = new ComponentBean();
//        componentBean1.setName("Komponente 1");
//        componentBeen.add(componentBean1);
//        ComponentBean componentBean2 = new ComponentBean();
//        componentBean2.setName("Komponente 2");
//        componentBeen.add(componentBean2);
//        fields.setComponents(componentBeen);
//
//        List<VersionBean> versionBeen = new ArrayList<>();
//        VersionBean versionBean1 = new VersionBean();
//        versionBean1.setName("1.1");
//        versionBeen.add(versionBean1);
//        VersionBean versionBean2 = new VersionBean();
//        versionBean2.setName("1.0");
//        versionBeen.add(versionBean2);
//        fields.setVersions(versionBeen);
//        fields.setFixVersions(versionBeen);
//
//        UserBean userBean = new UserBean();
//        userBean.setName("admin");
//        fields.setAssignee(userBean);
//        List<String> labels = new ArrayList<>();
//        labels.add("foobar");
//        labels.add("inubit");
//        fields.setLabels(labels);
//        issue.setFields(fields);
//
//        final Future<IssueResponse> future = jiraRestClient.getIssueClient().createIssue(issue);
//        final IssueResponse issueResponse = future.get();
//        if (issueResponse != null) {
//            String issueKey = issueResponse.getKey();
//            if (issueKey != null) {
//                System.out.println(issueKey);
//            } else {
//                System.out.println(issueResponse.getError());
//            }
//        }
        }
    }
