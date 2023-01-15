package kz.insomnia.find.author

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kz.insomnia.find.author.ui.theme.FindAuthorTheme
import kz.insomnia.find.author.ui.theme.Pink80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FindAuthorTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    Greeting("Nursultan")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FindAuthorTheme {
        Greeting("Nurs")
    }
}

@Composable
fun Greeting(name: String) {
    var visible by remember {
        mutableStateOf(false)
    }
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        AnimatedVisibility(visible = visible) {
            Text(text = "$name, clicked me!", color = Pink80)
        }
        Button(onClick = { visible = !visible }) {
            Text("$name, Click Me", color = Color(0xFFffffff))
        }
    }
}