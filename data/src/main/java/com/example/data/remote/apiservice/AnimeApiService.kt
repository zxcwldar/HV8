package com.example.data.remote.apiservice

import com.example.domain.model.AnimeModel
import retrofit2.http.GET

interface AnimeApiService {

    @GET("anime")
    suspend fun fetchAnime(): AnimeModel
}