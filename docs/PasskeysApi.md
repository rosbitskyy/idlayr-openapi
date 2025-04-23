# PasskeysApi

All URIs are relative to *https://eu.api.idlayr.com/v2/passkeys*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersUidPasskeysCredidDelete**](PasskeysApi.md#usersUidPasskeysCredidDelete) | **DELETE** /users/{uid}/passkeys/{credid} | Schedule passkey for deletion |
| [**usersUidPasskeysCredidGet**](PasskeysApi.md#usersUidPasskeysCredidGet) | **GET** /users/{uid}/passkeys/{credid} | Get specific passkey |
| [**usersUidPasskeysCredidPut**](PasskeysApi.md#usersUidPasskeysCredidPut) | **PUT** /users/{uid}/passkeys/{credid} | Update passkey friendly name |
| [**usersUidPasskeysGet**](PasskeysApi.md#usersUidPasskeysGet) | **GET** /users/{uid}/passkeys | List user passkeys |


<a id="usersUidPasskeysCredidDelete"></a>
# **usersUidPasskeysCredidDelete**
> usersUidPasskeysCredidDelete(uid, credid)

Schedule passkey for deletion

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PasskeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    PasskeysApi apiInstance = new PasskeysApi(defaultClient);
    String uid = "uid_example"; // String | 
    String credid = "credid_example"; // String | 
    try {
      apiInstance.usersUidPasskeysCredidDelete(uid, credid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasskeysApi#usersUidPasskeysCredidDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uid** | **String**|  | |
| **credid** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Passkey disabled |  -  |

<a id="usersUidPasskeysCredidGet"></a>
# **usersUidPasskeysCredidGet**
> Passkey usersUidPasskeysCredidGet(uid, credid)

Get specific passkey

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PasskeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    PasskeysApi apiInstance = new PasskeysApi(defaultClient);
    String uid = "uid_example"; // String | 
    String credid = "credid_example"; // String | 
    try {
      Passkey result = apiInstance.usersUidPasskeysCredidGet(uid, credid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasskeysApi#usersUidPasskeysCredidGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uid** | **String**|  | |
| **credid** | **String**|  | |

### Return type

[**Passkey**](Passkey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Passkey object |  -  |

<a id="usersUidPasskeysCredidPut"></a>
# **usersUidPasskeysCredidPut**
> usersUidPasskeysCredidPut(uid, credid, passkey)

Update passkey friendly name

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PasskeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    PasskeysApi apiInstance = new PasskeysApi(defaultClient);
    String uid = "uid_example"; // String | 
    String credid = "credid_example"; // String | 
    Passkey passkey = new Passkey(); // Passkey | 
    try {
      apiInstance.usersUidPasskeysCredidPut(uid, credid, passkey);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasskeysApi#usersUidPasskeysCredidPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uid** | **String**|  | |
| **credid** | **String**|  | |
| **passkey** | [**Passkey**](Passkey.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated |  -  |

<a id="usersUidPasskeysGet"></a>
# **usersUidPasskeysGet**
> List&lt;Passkey&gt; usersUidPasskeysGet(uid)

List user passkeys

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PasskeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    PasskeysApi apiInstance = new PasskeysApi(defaultClient);
    String uid = "uid_example"; // String | 
    try {
      List<Passkey> result = apiInstance.usersUidPasskeysGet(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasskeysApi#usersUidPasskeysGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uid** | **String**|  | |

### Return type

[**List&lt;Passkey&gt;**](Passkey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of passkeys |  -  |

