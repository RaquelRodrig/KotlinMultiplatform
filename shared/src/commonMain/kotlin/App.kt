package auction

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import auction.ui.AuctionItemList
import auction.ui.AuctionItemDetail

@Composable
fun App(apiKey: String) {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            val navController = rememberNavController()
            val viewModel: AuctionViewModel = viewModel(factory = AuctionViewModelFactory(apiKey))

            NavHost(navController, startDestination = "itemList") {
                composable("itemList") {
                    AuctionItemList(viewModel, navController)
                }
                composable("itemDetail/{itemId}") { backStackEntry ->
                    val itemId = backStackEntry.arguments?.getString("itemId")
                    val item = viewModel.items.find { it.id == itemId }
                    if (item != null) {
                        AuctionItemDetail(viewModel, item)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewApp() {
    App(apiKey = "RAQUEL_API_KEY")
}