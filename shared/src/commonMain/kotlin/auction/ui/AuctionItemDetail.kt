package auction.ui

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import auction.AuctionItem
import auction.AuctionViewModel

@Composable
fun AuctionItemDetail(viewModel: AuctionViewModel, item: AuctionItem) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = item.name, style = MaterialTheme.typography.h4)
        Text(text = "Current Bid: $${item.currentBid}", style = MaterialTheme.typography.body1)
        BidInput(itemId = item.id) { id, bid ->
            viewModel.placeBid(id, bid)
        }
    }
}