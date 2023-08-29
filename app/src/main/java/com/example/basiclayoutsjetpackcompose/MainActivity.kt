package com.example.basiclayoutsjetpackcompose


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.basiclayoutsjetpackcompose.ui.theme.BasicLayoutsJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicLayoutsJetpackComposeTheme {
//                    ListViewItem(R.drawable.background, "Fatiq Hussnain", "Android Developer")
//                    GreetingPreview()
//                Recomposable()
//                NotificationScreen()

//                Profile()
                TopAppBar()
            }
        }
    }
}


@Composable
fun Recomposable() {
    val state = remember { mutableStateOf(0.0) }
    Log.d("Tag", "Logged during initial Composition")
    Button(onClick = { state.value = Math.random() }) {
        Log.d("Tag", "Logged during both Composition & Recomposition")
        Text(text = state.value.toString())
    }
}

@Composable
fun App() {
    var state = remember {
        mutableStateOf(false)
    }

    DisposableEffect(key1 = state.value) {
        onDispose {

        }
    }
}