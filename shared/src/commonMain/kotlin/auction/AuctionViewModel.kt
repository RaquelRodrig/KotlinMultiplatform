package auction

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AuctionViewModel(private val apiKey: String) : ViewModel() {
    private val apiClient = ApiClient(apiKey)

    var items: List<AuctionItem> = emptyList()
        private set

    var loading: Boolean = true
        private set

    fun fetchItems() {
        viewModelScope.launch {
            try {
                loading = true
                items = apiClient.fetchAuctionItems()
            } catch (e: Exception) {
                // Handle error
            } finally {
                loading = false
            }
        }
    }

    fun placeBid(itemId: String, bidAmount: Double) {
        items = items.map { item ->
            if (item.id == itemId) {
                item.copy(currentBid = bidAmount) // Update current bid
            } else {
                item
            }
        }
    }
}
