/**
 * CPM API
 * Public API for CPM
 *
 * OpenAPI spec version: V1.0
 * Contact: info@addison.de
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


package instantreports.api;

import instantreports.ApiCallback;
import instantreports.ApiClient;
import instantreports.ApiException;
import instantreports.ApiResponse;
import instantreports.Configuration;
import instantreports.Pair;
import instantreports.ProgressRequestBody;
import instantreports.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import instantreports.model.Gruppensumme;
import instantreports.model.Schemaentry;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountingschemaApi {
    private ApiClient apiClient;

    public AccountingschemaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountingschemaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for accountingSchemaGruppensummeGet */
    private com.squareup.okhttp.Call accountingSchemaGruppensummeGetCall(String authorization, String organization, String where, String order, String skip, String take, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling accountingSchemaGruppensummeGet(Async)");
        }
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling accountingSchemaGruppensummeGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounting_schema/gruppensumme".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organization != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organization", organization));
        if (where != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "where", where));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
        if (take != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "take", take));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * get: accounting_schema/gruppensummen
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param where Filter on one or more Api-Contract fields. Default: \&quot;\&quot; (optional, default to )
     * @param order Sorting by a field of Api-contract. Default:\&quot;\&quot; (optional, default to )
     * @param skip Number of records to be skipped. Default: 0 (optional, default to 0)
     * @param take Max. Number of result set. Default: 15 (optional, default to 15)
     * @return Gruppensumme
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Gruppensumme accountingSchemaGruppensummeGet(String authorization, String organization, String where, String order, String skip, String take) throws ApiException {
        ApiResponse<Gruppensumme> resp = accountingSchemaGruppensummeGetWithHttpInfo(authorization, organization, where, order, skip, take);
        return resp.getData();
    }

    /**
     * get: accounting_schema/gruppensummen
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param where Filter on one or more Api-Contract fields. Default: \&quot;\&quot; (optional, default to )
     * @param order Sorting by a field of Api-contract. Default:\&quot;\&quot; (optional, default to )
     * @param skip Number of records to be skipped. Default: 0 (optional, default to 0)
     * @param take Max. Number of result set. Default: 15 (optional, default to 15)
     * @return ApiResponse&lt;Gruppensumme&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Gruppensumme> accountingSchemaGruppensummeGetWithHttpInfo(String authorization, String organization, String where, String order, String skip, String take) throws ApiException {
        com.squareup.okhttp.Call call = accountingSchemaGruppensummeGetCall(authorization, organization, where, order, skip, take, null, null);
        Type localVarReturnType = new TypeToken<Gruppensumme>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get: accounting_schema/gruppensummen (asynchronously)
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param where Filter on one or more Api-Contract fields. Default: \&quot;\&quot; (optional, default to )
     * @param order Sorting by a field of Api-contract. Default:\&quot;\&quot; (optional, default to )
     * @param skip Number of records to be skipped. Default: 0 (optional, default to 0)
     * @param take Max. Number of result set. Default: 15 (optional, default to 15)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accountingSchemaGruppensummeGetAsync(String authorization, String organization, String where, String order, String skip, String take, final ApiCallback<Gruppensumme> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accountingSchemaGruppensummeGetCall(authorization, organization, where, order, skip, take, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Gruppensumme>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for accountingSchemaGruppensummeResourceIdGet */
    private com.squareup.okhttp.Call accountingSchemaGruppensummeResourceIdGetCall(String authorization, String organization, String resourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling accountingSchemaGruppensummeResourceIdGet(Async)");
        }
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling accountingSchemaGruppensummeResourceIdGet(Async)");
        }
        
        // verify the required parameter 'resourceId' is set
        if (resourceId == null) {
            throw new ApiException("Missing the required parameter 'resourceId' when calling accountingSchemaGruppensummeResourceIdGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounting_schema/gruppensumme/{resourceId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "resourceId" + "\\}", apiClient.escapeString(resourceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organization != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organization", organization));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * get: accounting_schema/gruppensummen/id
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param resourceId The desired Api-Contract ID (required)
     * @return Gruppensumme
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Gruppensumme accountingSchemaGruppensummeResourceIdGet(String authorization, String organization, String resourceId) throws ApiException {
        ApiResponse<Gruppensumme> resp = accountingSchemaGruppensummeResourceIdGetWithHttpInfo(authorization, organization, resourceId);
        return resp.getData();
    }

    /**
     * get: accounting_schema/gruppensummen/id
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param resourceId The desired Api-Contract ID (required)
     * @return ApiResponse&lt;Gruppensumme&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Gruppensumme> accountingSchemaGruppensummeResourceIdGetWithHttpInfo(String authorization, String organization, String resourceId) throws ApiException {
        com.squareup.okhttp.Call call = accountingSchemaGruppensummeResourceIdGetCall(authorization, organization, resourceId, null, null);
        Type localVarReturnType = new TypeToken<Gruppensumme>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get: accounting_schema/gruppensummen/id (asynchronously)
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param resourceId The desired Api-Contract ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accountingSchemaGruppensummeResourceIdGetAsync(String authorization, String organization, String resourceId, final ApiCallback<Gruppensumme> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accountingSchemaGruppensummeResourceIdGetCall(authorization, organization, resourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Gruppensumme>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for accountingSchemaSchemaentryGet */
    private com.squareup.okhttp.Call accountingSchemaSchemaentryGetCall(String authorization, String organization, String where, String order, String skip, String take, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling accountingSchemaSchemaentryGet(Async)");
        }
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling accountingSchemaSchemaentryGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounting_schema/schemaentry".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organization != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organization", organization));
        if (where != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "where", where));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
        if (take != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "take", take));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * get: accounting_schema/schemaentries
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param where Filter on one or more Api-Contract fields. Default: \&quot;\&quot; (optional, default to )
     * @param order Sorting by a field of Api-contract. Default:\&quot;\&quot; (optional, default to )
     * @param skip Number of records to be skipped. Default: 0 (optional, default to 0)
     * @param take Max. Number of result set. Default: 15 (optional, default to 15)
     * @return Schemaentry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Schemaentry accountingSchemaSchemaentryGet(String authorization, String organization, String where, String order, String skip, String take) throws ApiException {
        ApiResponse<Schemaentry> resp = accountingSchemaSchemaentryGetWithHttpInfo(authorization, organization, where, order, skip, take);
        return resp.getData();
    }

    /**
     * get: accounting_schema/schemaentries
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param where Filter on one or more Api-Contract fields. Default: \&quot;\&quot; (optional, default to )
     * @param order Sorting by a field of Api-contract. Default:\&quot;\&quot; (optional, default to )
     * @param skip Number of records to be skipped. Default: 0 (optional, default to 0)
     * @param take Max. Number of result set. Default: 15 (optional, default to 15)
     * @return ApiResponse&lt;Schemaentry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Schemaentry> accountingSchemaSchemaentryGetWithHttpInfo(String authorization, String organization, String where, String order, String skip, String take) throws ApiException {
        com.squareup.okhttp.Call call = accountingSchemaSchemaentryGetCall(authorization, organization, where, order, skip, take, null, null);
        Type localVarReturnType = new TypeToken<Schemaentry>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get: accounting_schema/schemaentries (asynchronously)
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param where Filter on one or more Api-Contract fields. Default: \&quot;\&quot; (optional, default to )
     * @param order Sorting by a field of Api-contract. Default:\&quot;\&quot; (optional, default to )
     * @param skip Number of records to be skipped. Default: 0 (optional, default to 0)
     * @param take Max. Number of result set. Default: 15 (optional, default to 15)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accountingSchemaSchemaentryGetAsync(String authorization, String organization, String where, String order, String skip, String take, final ApiCallback<Schemaentry> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accountingSchemaSchemaentryGetCall(authorization, organization, where, order, skip, take, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Schemaentry>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for accountingSchemaSchemaentryResourceIdGet */
    private com.squareup.okhttp.Call accountingSchemaSchemaentryResourceIdGetCall(String authorization, String organization, String resourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling accountingSchemaSchemaentryResourceIdGet(Async)");
        }
        
        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException("Missing the required parameter 'organization' when calling accountingSchemaSchemaentryResourceIdGet(Async)");
        }
        
        // verify the required parameter 'resourceId' is set
        if (resourceId == null) {
            throw new ApiException("Missing the required parameter 'resourceId' when calling accountingSchemaSchemaentryResourceIdGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/accounting_schema/schemaentry/{resourceId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "resourceId" + "\\}", apiClient.escapeString(resourceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organization != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organization", organization));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * get: accounting_schema/schemaentries/id
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param resourceId The desired Api-Contract ID (required)
     * @return Schemaentry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Schemaentry accountingSchemaSchemaentryResourceIdGet(String authorization, String organization, String resourceId) throws ApiException {
        ApiResponse<Schemaentry> resp = accountingSchemaSchemaentryResourceIdGetWithHttpInfo(authorization, organization, resourceId);
        return resp.getData();
    }

    /**
     * get: accounting_schema/schemaentries/id
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param resourceId The desired Api-Contract ID (required)
     * @return ApiResponse&lt;Schemaentry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Schemaentry> accountingSchemaSchemaentryResourceIdGetWithHttpInfo(String authorization, String organization, String resourceId) throws ApiException {
        com.squareup.okhttp.Call call = accountingSchemaSchemaentryResourceIdGetCall(authorization, organization, resourceId, null, null);
        Type localVarReturnType = new TypeToken<Schemaentry>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get: accounting_schema/schemaentries/id (asynchronously)
     * 
     * @param authorization The authorization token. (required)
     * @param organization The corresponding ID for Mandanten, Kanzlei etc. (required)
     * @param resourceId The desired Api-Contract ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accountingSchemaSchemaentryResourceIdGetAsync(String authorization, String organization, String resourceId, final ApiCallback<Schemaentry> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accountingSchemaSchemaentryResourceIdGetCall(authorization, organization, resourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Schemaentry>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
