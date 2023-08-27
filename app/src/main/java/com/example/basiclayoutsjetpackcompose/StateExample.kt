package com.example.basiclayoutsjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NotificationScreen() {
    /* We are performing state hoisting for both functions to use the state at the same time */
    val count: MutableState<Int> = rememberSaveable {
        mutableStateOf(0)
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        NotificationCounter(count.value) { count.value++ }      /*we can move lambda out of function if it is last one in this case it is last one so we can move out of parenthesis*/
        MessageBar(count.value)
    }
}

@Composable
fun NotificationCounter(count: Int, increment: () -> Unit) {

    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "You have sent $count notification")
        Button(onClick = {
            increment()
        }) {
            Text(text = "Send Notification")
        }
    }
}

@Composable
fun MessageBar(count: Int) {
    Card(elevation = CardDefaults.cardElevation(6.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            Image(imageVector = Icons.Default.Send, contentDescription = "", Modifier.padding(5.dp))
            Text(text = "Messages sent so far - $count")

        }
    }
}