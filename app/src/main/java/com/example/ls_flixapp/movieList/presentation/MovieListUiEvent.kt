package com.example.ls_flixapp.movieList.presentation

sealed interface MovieListUiEvent {
    data class Paginate(val category: String) : MovieListUiEvent
    object  Navigate : MovieListUiEvent
}