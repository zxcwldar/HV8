package com.example.kotlin2lesson6.di

import com.example.data.repositories.AnimeRepositoryImpl
import com.example.data.repositories.MangaRepositoryImpl
import com.example.domain.repositories.AnimeRepository
import com.example.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {


    @Binds
    abstract fun provideAnimeRepository(animeRepositoryImpl: AnimeRepositoryImpl): AnimeRepository

    @Binds
    abstract fun provideMangaRepository(mangaRepositoryImpl: MangaRepositoryImpl): MangaRepository
}