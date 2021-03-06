// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Directory Role Request.
 */
public class BaseDirectoryRoleRequest extends BaseRequest implements IBaseDirectoryRoleRequest {

    /**
     * The request for the DirectoryRole
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseDirectoryRoleRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DirectoryRole from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<DirectoryRole> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DirectoryRole from the service
     * @return The DirectoryRole from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DirectoryRole get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this DirectoryRole with a source
     * @param sourceDirectoryRole The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final DirectoryRole sourceDirectoryRole, final ICallback<DirectoryRole> callback) {
        send(HttpMethod.PATCH, callback, sourceDirectoryRole);
    }

    /**
     * Patches this DirectoryRole with a source
     * @param sourceDirectoryRole The source object with updates
     * @return The updated DirectoryRole
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DirectoryRole patch(final DirectoryRole sourceDirectoryRole) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryRole);
    }

    /**
     * Creates a DirectoryRole with a new object
     * @param newDirectoryRole The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final DirectoryRole newDirectoryRole, final ICallback<DirectoryRole> callback) {
        send(HttpMethod.POST, callback, newDirectoryRole);
    }

    /**
     * Creates a DirectoryRole with a new object
     * @param newDirectoryRole The new object to create
     * @return The created DirectoryRole
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DirectoryRole post(final DirectoryRole newDirectoryRole) throws ClientException {
        return send(HttpMethod.POST, newDirectoryRole);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IDirectoryRoleRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DirectoryRoleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IDirectoryRoleRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DirectoryRoleRequest)this;
     }

}
