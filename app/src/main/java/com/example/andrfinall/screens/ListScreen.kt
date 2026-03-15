package com.example.andrfinall.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.andrfinall.models.Movie
import com.example.andrfinall.screens.components.MovieItem
import com.example.andrfinall.viewmodels.MoviesViewModel

@Composable
fun ListScreen(
    onMovieClick: (Movie) -> Unit,
    viewModel: MoviesViewModel = viewModel()
) {
    val movies = viewModel.movies

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(movies) { movie ->
            MovieItem(
                movie = movie,
                onItemClick = onMovieClick
            )
        }
    }
}