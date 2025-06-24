package auction

import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*

data class AuctionItem(val id: String, val name: String, val description: String)

class ApiClient(private val apiKey: String) {
    private val client = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

    suspend fun fetchAuctionItems(): List<AuctionItem> {
        return client.get("https://app.klaravik.dev/dev-test-api/auction-items") {
            headers {
                append("x-api-key", apiKey)
            }
        }
    }
}