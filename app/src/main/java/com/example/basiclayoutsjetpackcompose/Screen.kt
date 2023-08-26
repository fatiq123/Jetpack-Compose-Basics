package com.example.basiclayoutsjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayoutsjetpackcompose.ui.theme.BasicLayoutsJetpackComposeTheme

@Composable
fun ListViewItem(img: Int, title: String, subtitle: String, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        modifier = modifier.padding(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "background photo",
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(60.dp)
                    .padding(8.dp)
                    .clip(
                        CircleShape
                    )
            )
            ItemDescription(Modifier.weight(.8f), title, subtitle)
        }
    }
}

@Composable
private fun ItemDescription(
    modifier: Modifier,
    title: String,
    subtitle: String,
) {
    Column(modifier = modifier) {
        Text(text = title, style = MaterialTheme.typography.titleLarge, color = Color.Black)
        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Thin, color = Color.Black
        )
    }
}

@Preview(showBackground = true, heightDp = 500)
@Composable
fun GreetingPreview() {
    BasicLayoutsJetpackComposeTheme {
//        ListViewItem(R.drawable.background, "Fatiq Hussnain", "Android Developer")
        /*Column(Modifier.verticalScroll(rememberScrollState())) {
            getCategoryList().map {item ->
                ListViewItem(img = item.img, title = item.title, subtitle = item.subtitle)
            }
        }*/
        LazyColumn(content = {
            items(getCategoryList()) { item ->
                ListViewItem(img = item.img, title = item.title, subtitle = item.subtitle)
            }
        })

    }
}

