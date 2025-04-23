# ValidationApi

All URIs are relative to *https://eu.api.idlayr.com/v2/passkeys*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**passkeyAutofillCompletePost**](ValidationApi.md#passkeyAutofillCompletePost) | **POST** /passkey/autofill/complete | Complete autofill authentication |
| [**passkeyAutofillInitPost**](ValidationApi.md#passkeyAutofillInitPost) | **POST** /passkey/autofill/init | Init autofill authentication (usernameless) |
| [**usersUidPasskeysAuthCompletePost**](ValidationApi.md#usersUidPasskeysAuthCompletePost) | **POST** /users/{uid}/passkeys/auth/complete | Complete passkey authentication |
| [**usersUidPasskeysAuthInitPost**](ValidationApi.md#usersUidPasskeysAuthInitPost) | **POST** /users/{uid}/passkeys/auth/init | Start passkey authentication |
| [**usersUidPasskeysEnrolCompletePost**](ValidationApi.md#usersUidPasskeysEnrolCompletePost) | **POST** /users/{uid}/passkeys/enrol/complete | Complete passkey enrollment |
| [**usersUidPasskeysEnrolInitPost**](ValidationApi.md#usersUidPasskeysEnrolInitPost) | **POST** /users/{uid}/passkeys/enrol/init | Start passkey enrollment |


<a id="passkeyAutofillCompletePost"></a>
# **passkeyAutofillCompletePost**
> passkeyAutofillCompletePost(webAuthnGetAssertionResponse)

Complete autofill authentication

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    ValidationApi apiInstance = new ValidationApi(defaultClient);
    WebAuthnGetAssertionResponse webAuthnGetAssertionResponse = new WebAuthnGetAssertionResponse(); // WebAuthnGetAssertionResponse | 
    try {
      apiInstance.passkeyAutofillCompletePost(webAuthnGetAssertionResponse);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationApi#passkeyAutofillCompletePost");
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
| **webAuthnGetAssertionResponse** | [**WebAuthnGetAssertionResponse**](WebAuthnGetAssertionResponse.md)|  | |

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
| **200** | Authentication result |  -  |

<a id="passkeyAutofillInitPost"></a>
# **passkeyAutofillInitPost**
> WebAuthnGetAssertionRequest passkeyAutofillInitPost()

Init autofill authentication (usernameless)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    ValidationApi apiInstance = new ValidationApi(defaultClient);
    try {
      WebAuthnGetAssertionRequest result = apiInstance.passkeyAutofillInitPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationApi#passkeyAutofillInitPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebAuthnGetAssertionRequest**](WebAuthnGetAssertionRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | GetAssertionRequest |  -  |

<a id="usersUidPasskeysAuthCompletePost"></a>
# **usersUidPasskeysAuthCompletePost**
> usersUidPasskeysAuthCompletePost(uid, webAuthnGetAssertionResponse)

Complete passkey authentication

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    ValidationApi apiInstance = new ValidationApi(defaultClient);
    String uid = "uid_example"; // String | 
    WebAuthnGetAssertionResponse webAuthnGetAssertionResponse = new WebAuthnGetAssertionResponse(); // WebAuthnGetAssertionResponse | 
    try {
      apiInstance.usersUidPasskeysAuthCompletePost(uid, webAuthnGetAssertionResponse);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationApi#usersUidPasskeysAuthCompletePost");
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
| **webAuthnGetAssertionResponse** | [**WebAuthnGetAssertionResponse**](WebAuthnGetAssertionResponse.md)|  | |

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
| **200** | Authentication result |  -  |

<a id="usersUidPasskeysAuthInitPost"></a>
# **usersUidPasskeysAuthInitPost**
> WebAuthnGetAssertionRequest usersUidPasskeysAuthInitPost(uid)

Start passkey authentication

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    ValidationApi apiInstance = new ValidationApi(defaultClient);
    String uid = "uid_example"; // String | 
    try {
      WebAuthnGetAssertionRequest result = apiInstance.usersUidPasskeysAuthInitPost(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationApi#usersUidPasskeysAuthInitPost");
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

[**WebAuthnGetAssertionRequest**](WebAuthnGetAssertionRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | GetAssertionRequest |  -  |

<a id="usersUidPasskeysEnrolCompletePost"></a>
# **usersUidPasskeysEnrolCompletePost**
> usersUidPasskeysEnrolCompletePost(uid, webAuthnMakeCredentialResponse)

Complete passkey enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    ValidationApi apiInstance = new ValidationApi(defaultClient);
    String uid = "uid_example"; // String | 
    WebAuthnMakeCredentialResponse webAuthnMakeCredentialResponse = new WebAuthnMakeCredentialResponse(); // WebAuthnMakeCredentialResponse | 
    try {
      apiInstance.usersUidPasskeysEnrolCompletePost(uid, webAuthnMakeCredentialResponse);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationApi#usersUidPasskeysEnrolCompletePost");
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
| **webAuthnMakeCredentialResponse** | [**WebAuthnMakeCredentialResponse**](WebAuthnMakeCredentialResponse.md)|  | |

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
| **200** | Passkey saved |  -  |

<a id="usersUidPasskeysEnrolInitPost"></a>
# **usersUidPasskeysEnrolInitPost**
> WebAuthnMakeCredentialRequest usersUidPasskeysEnrolInitPost(uid)

Start passkey enrollment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.idlayr.com/v2/passkeys");

    ValidationApi apiInstance = new ValidationApi(defaultClient);
    String uid = "uid_example"; // String | 
    try {
      WebAuthnMakeCredentialRequest result = apiInstance.usersUidPasskeysEnrolInitPost(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationApi#usersUidPasskeysEnrolInitPost");
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

[**WebAuthnMakeCredentialRequest**](WebAuthnMakeCredentialRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | MakeCredentialRequest |  -  |

