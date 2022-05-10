package com.example.kotlin2lesson6.di

import com.example.data.repository.AnimeRepositoryImpl
import com.example.domain.repositories.AnimeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module()
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {


    @Binds
    abstract fun provideAnimeRepository(animeRepositoryImpl: AnimeRepositoryImpl): AnimeRepository

}