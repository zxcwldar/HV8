package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.AnimeModel
import com.google.gson.annotations.SerializedName

data class AnimeDto(
    @SerializedName("data")
    val data: List<Data>
)

fun AnimeDto.toDomain() = AnimeModel(data.map { it.toDomain() })