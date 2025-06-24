package auction.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp

@Composable
fun BidInput(itemId: String, onBidPlaced: (String, Double) -> Unit) {
    var bidAmount by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = bidAmount,
            onValueChange = { bidAmount = it },
            label = { Text("Enter your bid") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                if (bidAmount.isNotEmpty()) {
                    onBidPlaced(itemId, bidAmount.toDouble())
                    bidAmount = "" // Clear input after placing a bid
                }
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Place Bid")
        }
    }
}
