package com.example.basiclayoutsjetpackcompose

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopAppBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        IconButton(onClick = {
            /*show any message here or create any intent*/
        }) {
            Image(
                painter = painterResource(id = R.drawable.kotlin),
                contentDescription = "Kotlin Image",
                modifier = Modifier.size(30.dp)
            )
        }
        Text(
            text = "Interests",
            style = MaterialTheme.typography.titleLarge,
            fontStyle = FontStyle.Normal,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth(.5f)
                .padding(horizontal = 20.dp)
        )
        IconButton(onClick = {
            /*show any message here or create any intent*/
        }) {
            Image(
                painter = painterResource(id = R.drawable.python),
                contentDescription = "Python Image",
                modifier = Modifier.size(30.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewTopAppBar() {
    TopAppBar()
}