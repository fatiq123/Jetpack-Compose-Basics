package com.example.basiclayoutsjetpackcompose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Card() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(8.dp)) {
        Row {
            Text(text = "Fatiq Hussnain")
        }
    }
}

@Preview
@Composable
fun PreviewCard() {
    Card()
}