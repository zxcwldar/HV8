package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.GenresModel
import com.example.domain.models.animemodel.LinksXModel
import com.google.gson.annotations.SerializedName

data class Genres(
    @SerializedName("links")
    val links: LinksXModel?
)
fun Genres.toDomain() = GenresModel(links)