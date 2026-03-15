package com.example.andrfinall.models

data class Movie(
    val id: Int,
    val title: String,
    val genres: List<String>,
    val description: String,
    val year: Int,
    val countries: List<String>,
    val actors: List<String>,
    val director: String,
    val duration: Int,
    val rating: Double
)