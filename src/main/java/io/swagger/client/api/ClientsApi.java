/**
 * The Meltwater API
 * The Meltwater API provides the needed resources for Meltwater clients to create & delete REST Hooks and stream Meltwater search results to your specified destination.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@api.meltwater.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.ClientCredentials;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientsApi {
    private ApiClient apiClient;

    public ClientsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClientsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createClientCredentials */
    private com.squareup.okhttp.Call createClientCredentialsCall(String userKey, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userKey' is set
        if (userKey == null) {
            throw new ApiException("Missing the required parameter 'userKey' when calling createClientCredentials(Async)");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling createClientCredentials(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/v1/clients".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (userKey != null)
        localVarHeaderParams.put("user-key", apiClient.parameterToString(userKey));
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Register new client
     * Register new client     Creates a new pair of client credentials (&#x60;client_id&#x60;/&#x60;client_secret&#x60; pair).  Requires your Meltwater credentials (&#x60;email&#x60;:&#x60;password&#x60;) to authenticate.   #### Appendix    The Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; string can be generated in a terminal  with following command:        $ echo -n \&quot;your_email@your_domain.com:your_secret_password\&quot; | base64    &lt;i&gt;You will need &#x60;base64&#x60; installed.&lt;/i&gt;
     * @param userKey The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). (required)
     * @param authorization &#x60;email&#x60;:&#x60;password&#x60;    Basic Auth (RFC2617) credentials. Must contain the realm &#x60;Basic&#x60; followed by a  Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ&#x3D; (required)
     * @return ClientCredentials
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ClientCredentials createClientCredentials(String userKey, String authorization) throws ApiException {
        ApiResponse<ClientCredentials> resp = createClientCredentialsWithHttpInfo(userKey, authorization);
        return resp.getData();
    }

    /**
     * Register new client
     * Register new client     Creates a new pair of client credentials (&#x60;client_id&#x60;/&#x60;client_secret&#x60; pair).  Requires your Meltwater credentials (&#x60;email&#x60;:&#x60;password&#x60;) to authenticate.   #### Appendix    The Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; string can be generated in a terminal  with following command:        $ echo -n \&quot;your_email@your_domain.com:your_secret_password\&quot; | base64    &lt;i&gt;You will need &#x60;base64&#x60; installed.&lt;/i&gt;
     * @param userKey The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). (required)
     * @param authorization &#x60;email&#x60;:&#x60;password&#x60;    Basic Auth (RFC2617) credentials. Must contain the realm &#x60;Basic&#x60; followed by a  Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ&#x3D; (required)
     * @return ApiResponse&lt;ClientCredentials&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ClientCredentials> createClientCredentialsWithHttpInfo(String userKey, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = createClientCredentialsCall(userKey, authorization, null, null);
        Type localVarReturnType = new TypeToken<ClientCredentials>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Register new client (asynchronously)
     * Register new client     Creates a new pair of client credentials (&#x60;client_id&#x60;/&#x60;client_secret&#x60; pair).  Requires your Meltwater credentials (&#x60;email&#x60;:&#x60;password&#x60;) to authenticate.   #### Appendix    The Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; string can be generated in a terminal  with following command:        $ echo -n \&quot;your_email@your_domain.com:your_secret_password\&quot; | base64    &lt;i&gt;You will need &#x60;base64&#x60; installed.&lt;/i&gt;
     * @param userKey The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). (required)
     * @param authorization &#x60;email&#x60;:&#x60;password&#x60;    Basic Auth (RFC2617) credentials. Must contain the realm &#x60;Basic&#x60; followed by a  Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ&#x3D; (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createClientCredentialsAsync(String userKey, String authorization, final ApiCallback<ClientCredentials> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createClientCredentialsCall(userKey, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ClientCredentials>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteClientCredentials */
    private com.squareup.okhttp.Call deleteClientCredentialsCall(String userKey, String authorization, String clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userKey' is set
        if (userKey == null) {
            throw new ApiException("Missing the required parameter 'userKey' when calling deleteClientCredentials(Async)");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling deleteClientCredentials(Async)");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling deleteClientCredentials(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/v1/clients/{client_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "client_id" + "\\}", apiClient.escapeString(clientId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (userKey != null)
        localVarHeaderParams.put("user-key", apiClient.parameterToString(userKey));
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Delete client.
     * Delete client.    Deletes your current client credentials consisting of  client_id and client_secret. After calling this resource, you will not be able  to use the Meltwater API unless you create a new set of client credentials!  Requires your Meltwater credentials (&#x60;email&#x60;:&#x60;password&#x60;) to authenticate.   #### Appendix    The Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; string can be generated in a terminal  with following command:        $ echo -n \&quot;your_email@your_domain.com:your_secret_password\&quot; | base64    &lt;i&gt;You will need &#x60;base64&#x60; installed.&lt;/i&gt;
     * @param userKey The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). (required)
     * @param authorization &#x60;email&#x60;:&#x60;password&#x60;    Basic Auth (RFC2617) credentials. Must contain the realm &#x60;Basic&#x60; followed by a  Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ&#x3D; (required)
     * @param clientId Client ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteClientCredentials(String userKey, String authorization, String clientId) throws ApiException {
        deleteClientCredentialsWithHttpInfo(userKey, authorization, clientId);
    }

    /**
     * Delete client.
     * Delete client.    Deletes your current client credentials consisting of  client_id and client_secret. After calling this resource, you will not be able  to use the Meltwater API unless you create a new set of client credentials!  Requires your Meltwater credentials (&#x60;email&#x60;:&#x60;password&#x60;) to authenticate.   #### Appendix    The Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; string can be generated in a terminal  with following command:        $ echo -n \&quot;your_email@your_domain.com:your_secret_password\&quot; | base64    &lt;i&gt;You will need &#x60;base64&#x60; installed.&lt;/i&gt;
     * @param userKey The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). (required)
     * @param authorization &#x60;email&#x60;:&#x60;password&#x60;    Basic Auth (RFC2617) credentials. Must contain the realm &#x60;Basic&#x60; followed by a  Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ&#x3D; (required)
     * @param clientId Client ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteClientCredentialsWithHttpInfo(String userKey, String authorization, String clientId) throws ApiException {
        com.squareup.okhttp.Call call = deleteClientCredentialsCall(userKey, authorization, clientId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete client. (asynchronously)
     * Delete client.    Deletes your current client credentials consisting of  client_id and client_secret. After calling this resource, you will not be able  to use the Meltwater API unless you create a new set of client credentials!  Requires your Meltwater credentials (&#x60;email&#x60;:&#x60;password&#x60;) to authenticate.   #### Appendix    The Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; string can be generated in a terminal  with following command:        $ echo -n \&quot;your_email@your_domain.com:your_secret_password\&quot; | base64    &lt;i&gt;You will need &#x60;base64&#x60; installed.&lt;/i&gt;
     * @param userKey The &#x60;user_key&#x60; from [developer.meltwater.io](https://developer.meltwater.io/admin/applications/). (required)
     * @param authorization &#x60;email&#x60;:&#x60;password&#x60;    Basic Auth (RFC2617) credentials. Must contain the realm &#x60;Basic&#x60; followed by a  Base64-encoded &#x60;email&#x60;:&#x60;password&#x60; pair using your Meltwater credentials.    #### Example:        Basic bXlfZW1haWxAZXhhbXJzZWNyZXQ&#x3D; (required)
     * @param clientId Client ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteClientCredentialsAsync(String userKey, String authorization, String clientId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteClientCredentialsCall(userKey, authorization, clientId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
