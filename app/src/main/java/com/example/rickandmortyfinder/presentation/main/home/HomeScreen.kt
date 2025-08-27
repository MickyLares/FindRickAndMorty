package com.example.rickandmortyfinder.presentation.main.home

import CarouselHome
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.rickandmortyfinder.model.BottomMenuItem
import com.example.rickandmortyfinder.presentation.main.MainViewModel
import com.example.rickandmortyfinder.util.BottomBarDestination

@Composable
fun HomeScreen(
    viewModel: MainViewModel,
    onNavigate: (String) -> Unit = {},
    onClickCard: (id: Int) -> Unit
) {

    var selecteItem by remember { mutableIntStateOf(0) }
    val items = listOf(
        BottomMenuItem("Home", Icons.Default.Home, BottomBarDestination.HOME.route),
        BottomMenuItem("Location", Icons.Default.LocationOn, BottomBarDestination.LOCATION.route)
    )

    Scaffold(
        topBar = {},
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selecteItem == index,
                        onClick = {
                            selecteItem = index
                            onNavigate(item.route)
                        },
                        label = { Text(text = item.label) },
                        icon = { Icon(item.icon, contentDescription = item.label) }
                    )
                }
            }
        }
    ) { paddingValues ->


        CarouselHome(paddingValues, viewModel) { id ->
            onClickCard.invoke(id)
        }

    }
}