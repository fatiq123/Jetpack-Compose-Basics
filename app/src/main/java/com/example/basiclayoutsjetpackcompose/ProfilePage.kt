package com.example.basiclayoutsjetpackcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSavedStateRegistryOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Profile() {
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxSize(1f)
            .padding(8.dp),
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp)
        ) {
            Row(horizontalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = "Profile Image",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(
                            CircleShape
                        )
                        .border(
                            border = BorderStroke(1.dp, color = Color.Black),
                            shape = CircleShape
                        ),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.TopCenter
                )
            }
            Row(
                modifier = Modifier.padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Fatiq Hussnain",
                    style = MaterialTheme.typography.titleLarge,
                    fontStyle = FontStyle.Normal,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 25.sp
                )
            }
            Row(
                modifier = Modifier.padding(top = 5.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "fatiqhussnain1@gmail.com",
                    style = MaterialTheme.typography.titleSmall,
                    fontStyle = FontStyle.Normal,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp
                )
            }
            Row(
                modifier = Modifier.padding(top = 5.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "+923229549909",
                    style = MaterialTheme.typography.titleSmall,
                    fontStyle = FontStyle.Normal,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp
                )
            }
            Divider(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(.5f),
                color = Color.Black,
                thickness = 1.dp
            )


            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth(.8f)
                    .padding(16.dp),
                /*.align(CenterHorizontally)*/
                elevation = CardDefaults.outlinedCardElevation(2.dp),
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),     /* this line is very important to align center the text interest */
                        text = "Interests",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleLarge,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = " -> App Development.",
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.titleMedium,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = " -> Data Science AI & ML.",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.padding(bottom = 15.dp))
                }

            }


            Spacer(modifier = Modifier.height(5.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth(.8f)
                    .padding(16.dp),
                /*.align(CenterHorizontally)*/
                elevation = CardDefaults.outlinedCardElevation(2.dp),
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),     /* this line is very important to align center the text interest */
                        text = "Programming Languages",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleLarge,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = " -> Kotlin.",
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.titleMedium,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = " -> Python.",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.padding(bottom = 15.dp))
                }

            }



            Spacer(modifier = Modifier.height(5.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth(.8f)
                    .padding(16.dp),
                /*.align(CenterHorizontally)*/
                elevation = CardDefaults.outlinedCardElevation(2.dp),
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),     /* this line is very important to align center the text interest */
                        text = "Education",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleLarge,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = " -> Metric in Science.",
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.titleMedium,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = " -> Inter in computer science.",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = " -> BSCS 3rd year at UET Lahore.",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.padding(bottom = 15.dp))
                }

            }


        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewProfile() {
    Profile()
}