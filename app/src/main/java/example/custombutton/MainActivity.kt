package example.custombutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import example.custombutton.ui.theme.CustomButtonTheme
import example.reusablebutton.ReusableButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomButtonTheme {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(200.dp)) {
                    Greeting("compañero")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    ReusableButton(name, "md", "¡Pulse Aquí!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CustomButtonTheme {
        Greeting("Android")
    }
}