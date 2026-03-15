package com.example.andrfinall.navigation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.andrfinall.screens.HomeScreen
import com.example.andrfinall.screens.ListScreen
import com.example.andrfinall.screens.MovieDetailsScreen
import com.example.andrfinall.screens.NotificationsScreen
import com.example.andrfinall.viewmodels.MoviesViewModel

@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val moviesViewModel: MoviesViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = NavItem.Home.route,
        modifier = modifier
    ) {
        composable(NavItem.Home.route) {
            HomeScreen()
        }

        composable(NavItem.List.route) {
            ListScreen(
                onMovieClick = { movie ->
                    navController.navigate("details/${movie.id}")
                }
            )
        }

        composable("details/{movieId}") { backStackEntry ->
            val movieId = backStackEntry.arguments?.getString("movieId")?.toIntOrNull() ?: 0
            val movie = moviesViewModel.movies.find { it.id == movieId }
            if (movie != null) {
                MovieDetailsScreen(
                    movie = movie,
                    navController = navController
                )
            }
        }

        composable(NavItem.Notifications.route) {
            NotificationsScreen()
        }
    }
}