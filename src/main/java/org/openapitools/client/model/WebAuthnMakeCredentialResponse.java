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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.WebAuthnMakeCredentialResponseResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * WebAuthnMakeCredentialResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-23T11:56:01.733301+03:00[Europe/Sofia]", comments = "Generator version: 7.7.0")
public class WebAuthnMakeCredentialResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RAW_ID = "rawId";
  @SerializedName(SERIALIZED_NAME_RAW_ID)
  private String rawId;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private WebAuthnMakeCredentialResponseResponse response;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public WebAuthnMakeCredentialResponse() {
  }

  public WebAuthnMakeCredentialResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public WebAuthnMakeCredentialResponse rawId(String rawId) {
    this.rawId = rawId;
    return this;
  }

  /**
   * Get rawId
   * @return rawId
   */
  @javax.annotation.Nullable
  public String getRawId() {
    return rawId;
  }

  public void setRawId(String rawId) {
    this.rawId = rawId;
  }


  public WebAuthnMakeCredentialResponse response(WebAuthnMakeCredentialResponseResponse response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
   */
  @javax.annotation.Nullable
  public WebAuthnMakeCredentialResponseResponse getResponse() {
    return response;
  }

  public void setResponse(WebAuthnMakeCredentialResponseResponse response) {
    this.response = response;
  }


  public WebAuthnMakeCredentialResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebAuthnMakeCredentialResponse webAuthnMakeCredentialResponse = (WebAuthnMakeCredentialResponse) o;
    return Objects.equals(this.id, webAuthnMakeCredentialResponse.id) &&
        Objects.equals(this.rawId, webAuthnMakeCredentialResponse.rawId) &&
        Objects.equals(this.response, webAuthnMakeCredentialResponse.response) &&
        Objects.equals(this.type, webAuthnMakeCredentialResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rawId, response, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebAuthnMakeCredentialResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rawId: ").append(toIndentedString(rawId)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("rawId");
    openapiFields.add("response");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebAuthnMakeCredentialResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebAuthnMakeCredentialResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebAuthnMakeCredentialResponse is not found in the empty JSON string", WebAuthnMakeCredentialResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebAuthnMakeCredentialResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebAuthnMakeCredentialResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("rawId") != null && !jsonObj.get("rawId").isJsonNull()) && !jsonObj.get("rawId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rawId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rawId").toString()));
      }
      // validate the optional field `response`
      if (jsonObj.get("response") != null && !jsonObj.get("response").isJsonNull()) {
        WebAuthnMakeCredentialResponseResponse.validateJsonElement(jsonObj.get("response"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebAuthnMakeCredentialResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebAuthnMakeCredentialResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebAuthnMakeCredentialResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebAuthnMakeCredentialResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WebAuthnMakeCredentialResponse>() {
           @Override
           public void write(JsonWriter out, WebAuthnMakeCredentialResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebAuthnMakeCredentialResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebAuthnMakeCredentialResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebAuthnMakeCredentialResponse
   * @throws IOException if the JSON string is invalid with respect to WebAuthnMakeCredentialResponse
   */
  public static WebAuthnMakeCredentialResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebAuthnMakeCredentialResponse.class);
  }

  /**
   * Convert an instance of WebAuthnMakeCredentialResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

