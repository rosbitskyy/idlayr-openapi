

# Passkey


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**credId** | **String** |  |  [optional] |
|**counter** | **Integer** |  |  [optional] |
|**publicKey** | **byte[]** |  |  [optional] |
|**aaguid** | **UUID** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**friendlyName** | **String** |  |  [optional] |
|**lastUsed** | **OffsetDateTime** |  |  [optional] |
|**attestationValid** | **Boolean** |  |  [optional] |
|**authenticatorInfo** | [**AuthenticatorInfo**](AuthenticatorInfo.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PASSKEY | &quot;passkey&quot; |
| SECURITY_KEY | &quot;security-key&quot; |



