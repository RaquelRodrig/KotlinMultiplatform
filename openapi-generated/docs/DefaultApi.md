# DefaultApi

All URIs are relative to *https://app.klaravik.dev/dev-test-api*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**categoriesGet**](DefaultApi.md#categoriesGet) | **GET** /categories | Retrieve categories |
| [**productsGet**](DefaultApi.md#productsGet) | **GET** /products | Retrieve products |


<a id="categoriesGet"></a>
# **categoriesGet**
> kotlin.collections.List&lt;Category&gt; categoriesGet()

Retrieve categories

### Example
```kotlin
// Import classes:
//import com.example.api.infrastructure.*
//import com.example.api.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<Category> = apiInstance.categoriesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#categoriesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#categoriesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Category&gt;**](Category.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="productsGet"></a>
# **productsGet**
> kotlin.collections.List&lt;Product&gt; productsGet()

Retrieve products

### Example
```kotlin
// Import classes:
//import com.example.api.infrastructure.*
//import com.example.api.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<Product> = apiInstance.productsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#productsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#productsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Product&gt;**](Product.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

