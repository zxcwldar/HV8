package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.model.AnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    fun fetchAnime() : Flow<Either<String, AnimeModel>>
}