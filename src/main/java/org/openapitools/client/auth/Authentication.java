/*
 * Copyright (c) 2025.
 * @Author: Rosbitskyy Ruslan
 * @email: rosbitskyy@gmail.com
 * @license Licensed under the MIT License (MIT)
 */

/*
 * IDLayr Passkeys
 * Base API definition for IDLayr Passkey Server 
 *
 * The version of the OpenAPI document: 1.0.12
 * Contact: help@idlayr.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.auth;

import org.openapitools.client.Pair;
import org.openapitools.client.ApiException;

import java.net.URI;
import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     * @param cookieParams Map of cookie parameters
     * @param payload HTTP request body
     * @param method HTTP method
     * @param uri URI
     * @throws ApiException if failed to update the parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams, String payload, String method, URI uri) throws ApiException;
}
