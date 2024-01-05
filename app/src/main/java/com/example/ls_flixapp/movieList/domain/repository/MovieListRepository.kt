package com.example.ls_flixapp.movieList.domain.repository

import com.example.ls_flixapp.movieList.domain.model.Movie
import com.example.ls_flixapp.movieList.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun  getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ) : Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}