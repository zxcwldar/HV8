package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.AnimeModel
import com.example.domain.models.animemodel.DataModel
import com.google.gson.annotations.SerializedName

data class AnimeDto(
    @SerializedName("data")
    val data: List<DataModel>
)
fun AnimeDto.toDomain() = AnimeModel(data)