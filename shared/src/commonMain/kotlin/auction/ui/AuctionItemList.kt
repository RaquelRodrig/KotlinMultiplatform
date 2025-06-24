package auction.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import auction.AuctionItem
import auction.AuctionViewModel

@Composable
fun AuctionItemList(viewModel: AuctionViewModel, navController: NavHostController) {
    if (viewModel.loading) {
        CircularProgressIndicator()
    } else {
        LazyColumn {
            items(viewModel.items) { item ->
                AuctionItemRow(item) {
                    // Navigate to detail view
                    navController.navigate("itemDetail/${item.id}")
                }
            }
        }
    }
}

@Composable
fun AuctionItemRow(item: AuctionItem, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .clickable(onClick = onClick)
    ) {
        Text(text = item.name)
        Text(text = "Current Bid: $${item.currentBid}")
    }
}