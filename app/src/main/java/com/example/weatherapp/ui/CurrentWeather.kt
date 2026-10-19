
package com.example.weatherapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CurrentWeather(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Halifax")

        Spacer(modifier = Modifier.height(30.dp))

        Text("☀️", fontSize = 60.sp)

        Text("22°C", fontSize = 50.sp)

        Text("Sunny")

        Text("High: 24°C  Low: 16°C")

        Spacer(modifier = Modifier.height(40.dp))

        Row {
            Column {
                Text("Humidity")
                Text("65%")
            }

            Spacer(modifier = Modifier.width(50.dp))

            Column {
                Text("Wind")
                Text("12 km/h")
            }
        }
    }
}
