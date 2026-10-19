package com.example.weatherapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DailyForecast(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("5-Day Forecast", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(24.dp))

        ForecastRow("Today", "☀️", "24°C", "16°C")
        ForecastRow("Tue", "⛅", "22°C", "15°C")
        ForecastRow("Wed", "🌧️", "19°C", "13°C")
        ForecastRow("Thu", "☁️", "20°C", "14°C")
        ForecastRow("Fri", "🌤️", "23°C", "16°C")
    }
}

@Composable
fun ForecastRow(
    day: String,
    icon: String,
    high: String,
    low: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(day, fontSize = 18.sp)

        Text(icon, fontSize = 28.sp)

        Text(
            "$high / $low",
            fontSize = 18.sp
        )
    }
}