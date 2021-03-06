/*
 * Meltwater Streaming API v2
 * The Meltwater Streaming API provides the needed resources for Meltwater clients to create & delete REST Hooks and stream Meltwater search results to your specified destination.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@api.meltwater.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorsCollection;
import io.swagger.client.model.SearchesCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchesApi
 */
@Ignore
public class SearchesApiTest {

    private final SearchesApi api = new SearchesApi();

    
    /**
     * List your saved searches.
     *
     * List your saved searches.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSearchesTest() throws ApiException {
        String userKey = null;
        String authorization = null;
        SearchesCollection response = api.getAllSearches(userKey, authorization);

        // TODO: test validations
    }
    
}
