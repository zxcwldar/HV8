package com.example.data.remote.apiservice

import com.example.data.remote.animedtos.AnimeDto
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchAnimes(
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int,
    ): AnimeDto

    @GET("anime")
    suspend fun fetchAnime(): AnimeDto
}