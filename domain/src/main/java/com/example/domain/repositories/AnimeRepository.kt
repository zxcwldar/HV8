package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.animemodel.AnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    fun fetchAnime() : Flow<Either<String, AnimeModel>>
}