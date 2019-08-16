/*
 * Material Stock Display
 * This service enables you to retrieve material stock information using the OData protocol with filter data provided in the payload. It can be consumed by external warehouse applications.
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_material_stock_srv.api;

import com.sap.apibhub.sdk.client.ApiCallback;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.ApiException;
import com.sap.apibhub.sdk.client.ApiResponse;
import com.sap.apibhub.sdk.client.Configuration;
import com.sap.apibhub.sdk.client.Pair;
import com.sap.apibhub.sdk.client.ProgressRequestBody;
import com.sap.apibhub.sdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sap.apibhub.sdk.api_material_stock_srv.model.AMatlStkInAcctModType;
import com.sap.apibhub.sdk.api_material_stock_srv.model.OdataError;
import com.sap.apibhub.sdk.api_material_stock_srv.model.Wrapper1;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AMatlStkInAcctModApi {
    private ApiClient apiClient;

    public AMatlStkInAcctModApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AMatlStkInAcctModApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for aMatlStkInAcctModGet */
    private com.squareup.okhttp.Call aMatlStkInAcctModGetCall(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/A_MatlStkInAcctMod".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$skip", skip));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$filter", filter));
        if (inlinecount != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$inlinecount", inlinecount));
        if (orderby != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$orderby", orderby));
        if (select != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$select", select));
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$expand", expand));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call aMatlStkInAcctModGetValidateBeforeCall(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = aMatlStkInAcctModGetCall(top, skip, filter, inlinecount, orderby, select, expand, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get entities from A_MatlStkInAcctMod
     * 
     * @param top Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374630) (optional)
     * @param skip Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374631) (optional)
     * @param filter Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374625) (optional)
     * @param inlinecount Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption) (optional)
     * @param orderby Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374629) (optional)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return Wrapper1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Wrapper1 aMatlStkInAcctModGet(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand) throws ApiException {
        ApiResponse<Wrapper1> resp = aMatlStkInAcctModGetWithHttpInfo(top, skip, filter, inlinecount, orderby, select, expand);
        return resp.getData();
    }

    /**
     * Get entities from A_MatlStkInAcctMod
     * 
     * @param top Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374630) (optional)
     * @param skip Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374631) (optional)
     * @param filter Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374625) (optional)
     * @param inlinecount Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption) (optional)
     * @param orderby Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374629) (optional)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return ApiResponse&lt;Wrapper1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Wrapper1> aMatlStkInAcctModGetWithHttpInfo(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand) throws ApiException {
        com.squareup.okhttp.Call call = aMatlStkInAcctModGetValidateBeforeCall(top, skip, filter, inlinecount, orderby, select, expand, null, null);
        Type localVarReturnType = new TypeToken<Wrapper1>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get entities from A_MatlStkInAcctMod (asynchronously)
     * 
     * @param top Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374630) (optional)
     * @param skip Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374631) (optional)
     * @param filter Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374625) (optional)
     * @param inlinecount Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption) (optional)
     * @param orderby Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374629) (optional)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call aMatlStkInAcctModGetAsync(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand, final ApiCallback<Wrapper1> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = aMatlStkInAcctModGetValidateBeforeCall(top, skip, filter, inlinecount, orderby, select, expand, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Wrapper1>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet */
    private com.squareup.okhttp.Call aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGetCall(String material, String inventorySpecialStockType, String inventoryStockType, String plant, String storageLocation, String batch, String supplier, String customer, String wbSElementInternalID, String sdDocument, String sdDocumentItem, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/A_MatlStkInAcctMod(Material='{Material}',InventorySpecialStockType='{InventorySpecialStockType}',InventoryStockType='{InventoryStockType}',Plant='{Plant}',StorageLocation='{StorageLocation}',Batch='{Batch}',Supplier='{Supplier}',Customer='{Customer}',WBSElementInternalID='{WBSElementInternalID}',SDDocument='{SDDocument}',SDDocumentItem='{SDDocumentItem}')".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "Material" + "\\}", apiClient.escapeString(material.toString()))
        .replaceAll("\\{" + "InventorySpecialStockType" + "\\}", apiClient.escapeString(inventorySpecialStockType.toString()))
        .replaceAll("\\{" + "InventoryStockType" + "\\}", apiClient.escapeString(inventoryStockType.toString()))
        .replaceAll("\\{" + "Plant" + "\\}", apiClient.escapeString(plant.toString()))
        .replaceAll("\\{" + "StorageLocation" + "\\}", apiClient.escapeString(storageLocation.toString()))
        .replaceAll("\\{" + "Batch" + "\\}", apiClient.escapeString(batch.toString()))
        .replaceAll("\\{" + "Supplier" + "\\}", apiClient.escapeString(supplier.toString()))
        .replaceAll("\\{" + "Customer" + "\\}", apiClient.escapeString(customer.toString()))
        .replaceAll("\\{" + "WBSElementInternalID" + "\\}", apiClient.escapeString(wbSElementInternalID.toString()))
        .replaceAll("\\{" + "SDDocument" + "\\}", apiClient.escapeString(sdDocument.toString()))
        .replaceAll("\\{" + "SDDocumentItem" + "\\}", apiClient.escapeString(sdDocumentItem.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (select != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$select", select));
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$expand", expand));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGetValidateBeforeCall(String material, String inventorySpecialStockType, String inventoryStockType, String plant, String storageLocation, String batch, String supplier, String customer, String wbSElementInternalID, String sdDocument, String sdDocumentItem, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'material' is set
        if (material == null) {
            throw new ApiException("Missing the required parameter 'material' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        // verify the required parameter 'inventorySpecialStockType' is set
        if (inventorySpecialStockType == null) {
            throw new ApiException("Missing the required parameter 'inventorySpecialStockType' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        // verify the required parameter 'inventoryStockType' is set
        if (inventoryStockType == null) {
            throw new ApiException("Missing the required parameter 'inventoryStockType' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        // verify the required parameter 'plant' is set
        if (plant == null) {
            throw new ApiException("Missing the required parameter 'plant' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        // verify the required parameter 'storageLocation' is set
        if (storageLocation == null) {
            throw new ApiException("Missing the required parameter 'storageLocation' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        // verify the required parameter 'batch' is set
        if (batch == null) {
            throw new ApiException("Missing the required parameter 'batch' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        // verify the required parameter 'supplier' is set
        if (supplier == null) {
            throw new ApiException("Missing the required parameter 'supplier' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        // verify the required parameter 'customer' is set
        if (customer == null) {
            throw new ApiException("Missing the required parameter 'customer' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        // verify the required parameter 'wbSElementInternalID' is set
        if (wbSElementInternalID == null) {
            throw new ApiException("Missing the required parameter 'wbSElementInternalID' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        // verify the required parameter 'sdDocument' is set
        if (sdDocument == null) {
            throw new ApiException("Missing the required parameter 'sdDocument' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        // verify the required parameter 'sdDocumentItem' is set
        if (sdDocumentItem == null) {
            throw new ApiException("Missing the required parameter 'sdDocumentItem' when calling aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGetCall(material, inventorySpecialStockType, inventoryStockType, plant, storageLocation, batch, supplier, customer, wbSElementInternalID, sdDocument, sdDocumentItem, select, expand, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get entity from A_MatlStkInAcctMod by key
     * 
     * @param material Material in Respect of Which Stock is Managed (required)
     * @param inventorySpecialStockType Special Stock Indicator (required)
     * @param inventoryStockType Stock Type of Goods Movement (Stock Identifier) (required)
     * @param plant Plant (required)
     * @param storageLocation Storage Location (required)
     * @param batch Batch Number (Stock Identifier) (required)
     * @param supplier Account Number of Supplier or Creditor (Stock Identifier) (required)
     * @param customer Customer Number (Stock Identifier) (required)
     * @param wbSElementInternalID Valuated Sales Order Stock WBS Element (required)
     * @param sdDocument Sales Order Number of Valuated Sales Order Stock (required)
     * @param sdDocumentItem Sales Order Item of Valuated Sales Order Stock (required)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return AMatlStkInAcctModType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AMatlStkInAcctModType aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGet(String material, String inventorySpecialStockType, String inventoryStockType, String plant, String storageLocation, String batch, String supplier, String customer, String wbSElementInternalID, String sdDocument, String sdDocumentItem, List<String> select, List<String> expand) throws ApiException {
        ApiResponse<AMatlStkInAcctModType> resp = aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGetWithHttpInfo(material, inventorySpecialStockType, inventoryStockType, plant, storageLocation, batch, supplier, customer, wbSElementInternalID, sdDocument, sdDocumentItem, select, expand);
        return resp.getData();
    }

    /**
     * Get entity from A_MatlStkInAcctMod by key
     * 
     * @param material Material in Respect of Which Stock is Managed (required)
     * @param inventorySpecialStockType Special Stock Indicator (required)
     * @param inventoryStockType Stock Type of Goods Movement (Stock Identifier) (required)
     * @param plant Plant (required)
     * @param storageLocation Storage Location (required)
     * @param batch Batch Number (Stock Identifier) (required)
     * @param supplier Account Number of Supplier or Creditor (Stock Identifier) (required)
     * @param customer Customer Number (Stock Identifier) (required)
     * @param wbSElementInternalID Valuated Sales Order Stock WBS Element (required)
     * @param sdDocument Sales Order Number of Valuated Sales Order Stock (required)
     * @param sdDocumentItem Sales Order Item of Valuated Sales Order Stock (required)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return ApiResponse&lt;AMatlStkInAcctModType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AMatlStkInAcctModType> aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGetWithHttpInfo(String material, String inventorySpecialStockType, String inventoryStockType, String plant, String storageLocation, String batch, String supplier, String customer, String wbSElementInternalID, String sdDocument, String sdDocumentItem, List<String> select, List<String> expand) throws ApiException {
        com.squareup.okhttp.Call call = aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGetValidateBeforeCall(material, inventorySpecialStockType, inventoryStockType, plant, storageLocation, batch, supplier, customer, wbSElementInternalID, sdDocument, sdDocumentItem, select, expand, null, null);
        Type localVarReturnType = new TypeToken<AMatlStkInAcctModType>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get entity from A_MatlStkInAcctMod by key (asynchronously)
     * 
     * @param material Material in Respect of Which Stock is Managed (required)
     * @param inventorySpecialStockType Special Stock Indicator (required)
     * @param inventoryStockType Stock Type of Goods Movement (Stock Identifier) (required)
     * @param plant Plant (required)
     * @param storageLocation Storage Location (required)
     * @param batch Batch Number (Stock Identifier) (required)
     * @param supplier Account Number of Supplier or Creditor (Stock Identifier) (required)
     * @param customer Customer Number (Stock Identifier) (required)
     * @param wbSElementInternalID Valuated Sales Order Stock WBS Element (required)
     * @param sdDocument Sales Order Number of Valuated Sales Order Stock (required)
     * @param sdDocumentItem Sales Order Item of Valuated Sales Order Stock (required)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGetAsync(String material, String inventorySpecialStockType, String inventoryStockType, String plant, String storageLocation, String batch, String supplier, String customer, String wbSElementInternalID, String sdDocument, String sdDocumentItem, List<String> select, List<String> expand, final ApiCallback<AMatlStkInAcctModType> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = aMatlStkInAcctModMaterialMaterialInventorySpecialStockTypeInventorySpecialStockTypeInventoryStockTypeInventoryStockTypePlantPlantStorageLocationStorageLocationBatchBatchSupplierSupplierCustomerCustomerWBSElementInternalIDWBSElementInternalIDSDDocumentSDDocumentSDDocumentItemSDDocumentItemGetValidateBeforeCall(material, inventorySpecialStockType, inventoryStockType, plant, storageLocation, batch, supplier, customer, wbSElementInternalID, sdDocument, sdDocumentItem, select, expand, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AMatlStkInAcctModType>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
