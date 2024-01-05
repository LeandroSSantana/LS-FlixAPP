package com.example.ls_flixapp.di

import com.example.ls_flixapp.movieList.data.repository.MovieListRepositoryImpl
import com.example.ls_flixapp.movieList.domain.repository.MovieListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieListRepository(
        movieLisRepositoryImpl: MovieListRepositoryImpl
    ): MovieListRepository
}