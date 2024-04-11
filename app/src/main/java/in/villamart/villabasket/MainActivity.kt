package `in`.villamart.villabasket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import `in`.villamart.villabasket.ui.theme.VillaBasketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VillaBasketTheme {
                Surface {
                    Box(modifier = Modifier.fillMaxSize()) {
                        SplashScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun SplashScreen() {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF014017)), contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally ) {
            Text(
                text = "Villa Basket",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
            Text(
                text = "Happy Farmers, Healthy Consumers ",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 15.sp
            )
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = ""
            )

        }
    }

}

@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}
