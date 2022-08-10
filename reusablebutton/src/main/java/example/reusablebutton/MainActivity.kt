package example.reusablebutton

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import example.reusablebutton.ui.theme.ReusableButtonTheme

@Composable
fun ReusableButton(
    name: String = "amigo", size: String = "md", buttonText: String = "Saludos") {
    val ctx = LocalContext.current
    var w = 0
    var h = 0
    when (size) {
        "xl" -> {w = 400; h = 200}
        "lg" -> {w = 300; h = 150}
        "md" -> {w = 200; h = 100}
        "sm" -> {w = 150; h = 70}
        "xs" -> {w = 100; h = 50}
    }
    Button(
        modifier = Modifier.width(w.dp).height(h.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
        onClick = {
            Toast.makeText(ctx, "¡Felicidades ${name}!", Toast.LENGTH_SHORT).show()
        }) {
        Text(buttonText, color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReusableButtonTheme {
    }
}