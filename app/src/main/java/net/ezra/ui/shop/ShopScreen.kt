package net.ezra.ui.shop

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.ui.home.HomeScreen
import net.ezra.R

@Composable
fun ShopScreen(navController: NavHostController) {
Column {
    
    Text(text = "This i s the shop screen")
    
    Text(text = stringResource(id = R.string.mit))


    Text(
        modifier = Modifier

            .clickable {
                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_SHOP) { inclusive = true }
                }
            },
        text = "about",
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.onSurface
    )


}

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ShopScreen(rememberNavController())
}

