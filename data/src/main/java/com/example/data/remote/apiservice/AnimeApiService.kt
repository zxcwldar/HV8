package com.example.data.remote.apiservice

import com.example.data.remote.animedtos.AnimeDto
import retrofit2.http.GET

interface AnimeApiService {

    @GET("anime")
    suspend fun fetchAnime(): AnimeDto
}