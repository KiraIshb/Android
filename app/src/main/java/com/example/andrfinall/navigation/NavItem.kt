package com.example.andrfinall.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Home : NavItem("home", "Главная", Icons.Default.Home)
    data object List : NavItem("list", "Список", Icons.Default.List)
    data object Notifications : NavItem("notifications", "Уведомления", Icons.Default.Notifications)
}