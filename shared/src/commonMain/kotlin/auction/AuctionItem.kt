package auction

data class AuctionItem(
    val id: String,
    val name: String,
    val description: String,
    var currentBid: Double
)