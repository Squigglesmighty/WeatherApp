package com.example.weatherapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.setValue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    // Holds which tab is selected (0 = Search, 1 = Favorite). Gets redrawn with compose after changing
    var selectedTab by remember { mutableStateOf(0) }
    Scaffold(topBar = {
        TopAppBar(
            colors = topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ),
            title = {
                Text("Top app bar")
            }
        )
    },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                windowInsets = NavigationBarDefaults.windowInsets)
            {
                NavigationBarItem(
                    icon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search") },
                    label = { Text("Current Weather") },
                    // Highlighted only when this tab is selected
                    selected = selectedTab == 0,
                    // Switches to this tab when selected
                    onClick = {selectedTab = 0}
                )

                NavigationBarItem(
                    icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Daily Forecast") },
                    // Switches to this tab when selected
                    selected = selectedTab == 1,
                    // Switches to this tab when selected
                    onClick = {selectedTab = 1}
                )
            }
        }) {innerPadding ->
        // Picks which screen to show based on the selected tab
        when(selectedTab) {
            0 -> CurrentWeather(modifier = Modifier.padding(innerPadding))
            1 -> DailyForecast(modifier = Modifier.padding(innerPadding))

        }
    }
}


