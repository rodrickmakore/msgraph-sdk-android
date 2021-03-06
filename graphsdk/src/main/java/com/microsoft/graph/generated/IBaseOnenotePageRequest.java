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
 * The interface for the Base Onenote Page Request.
 */
public interface IBaseOnenotePageRequest extends IHttpRequest {

    /**
     * Gets the OnenotePage from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<OnenotePage> callback);

    /**
     * Gets the OnenotePage from the service
     * @return The OnenotePage from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OnenotePage get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OnenotePage with a source
     * @param sourceOnenotePage The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final OnenotePage sourceOnenotePage, final ICallback<OnenotePage> callback);

    /**
     * Patches this OnenotePage with a source
     * @param sourceOnenotePage The source object with updates
     * @return The updated OnenotePage
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OnenotePage patch(final OnenotePage sourceOnenotePage) throws ClientException;

    /**
     * Posts a OnenotePage with a new object
     * @param newOnenotePage The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final byte[] newOnenotePage, final ICallback<OnenotePage> callback);

    /**
     * Posts a OnenotePage with a new object
     * @param newOnenotePage The new object to create
     * @return The created OnenotePage
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OnenotePage post(final byte[] newOnenotePage) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseOnenotePageRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseOnenotePageRequest expand(final String value);

}
