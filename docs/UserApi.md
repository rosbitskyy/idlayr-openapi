# UserApi

All URIs are relative to *https://eu.api.idlayr.com/v2/passkeys*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersGet**](UserApi.md#usersGet) | **GET** /users | List user objects |
| [**usersPost**](UserApi.md#usersPost) | **POST** /users | Create user object |
| [**usersUidDelete**](UserApi.md#usersUidDelete) | **DELETE** /users/{uid} | Delete user object |
| [**usersUidGet**](UserApi.md#usersUidGet) | **GET** /users/{uid} | Get user object |
| [**usersUidPut**](UserApi.md#usersUidPut) | **PUT** /users/{uid} | Update user object |


<a id="usersGet"></a>
# **usersGet**
> List&lt;User&gt; usersGet(limit)

List user objects

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    UserApi apiInstance = new UserApi(defaultClient);
    Integer limit = 100; // Integer | 
    try {
      List<User> result = apiInstance.usersGet(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#usersGet");
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
| **limit** | **Integer**|  | [optional] [default to 100] |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="usersPost"></a>
# **usersPost**
> User usersPost(user)

Create user object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    UserApi apiInstance = new UserApi(defaultClient);
    User user = new User(); // User | 
    try {
      User result = apiInstance.usersPost(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#usersPost");
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
| **user** | [**User**](User.md)|  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User created |  -  |

<a id="usersUidDelete"></a>
# **usersUidDelete**
> usersUidDelete(uid)

Delete user object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    UserApi apiInstance = new UserApi(defaultClient);
    String uid = "uid_example"; // String | 
    try {
      apiInstance.usersUidDelete(uid);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#usersUidDelete");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted |  -  |

<a id="usersUidGet"></a>
# **usersUidGet**
> User usersUidGet(uid)

Get user object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    UserApi apiInstance = new UserApi(defaultClient);
    String uid = "uid_example"; // String | 
    try {
      User result = apiInstance.usersUidGet(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#usersUidGet");
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

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a id="usersUidPut"></a>
# **usersUidPut**
> usersUidPut(uid, user)

Update user object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    UserApi apiInstance = new UserApi(defaultClient);
    String uid = "uid_example"; // String | 
    User user = new User(); // User | 
    try {
      apiInstance.usersUidPut(uid, user);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#usersUidPut");
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
| **user** | [**User**](User.md)|  | |

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

