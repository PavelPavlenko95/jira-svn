package by.pavelpavlenko.jira.rest.client;

import by.pavelpavlenko.jira.rest.core.domain.JqlSearchResult;
import by.pavelpavlenko.jira.rest.core.domain.filter.FilterBean;
import by.pavelpavlenko.jira.rest.core.jql.JqlSearchBean;
import by.pavelpavlenko.jira.rest.core.util.RestException;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Future;


/**
 * User: pvl pvlnk
 */
public interface SearchClient {


    /**
     * Performs an extended search for issues given by the project.
     *
     * @return list of issues
     * @throws by.pavelpavlenko.jira.rest.core.util.RestException
     */
    Future<JqlSearchResult> searchIssues(JqlSearchBean jsb);

    /**
     * Create a new Search Filter for the logged in User
     *
     * @param filter
     * @return
     */
    Future<FilterBean> createSearchFilter(FilterBean filter);


    /**
     * Get favorite Filter for JqlSearch for the logged in User
     *
     * @return List of FilterBeans
     */
    Future<List<FilterBean>> getFavoriteFilter();

    /**
     * Get Filter by Id
     *
     * @param id the id of the filter
     * @return FilterBean
     */
    Future<FilterBean> getFilterById(String id);



}
