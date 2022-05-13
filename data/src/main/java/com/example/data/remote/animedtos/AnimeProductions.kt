package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.AnimeProductionsModel
import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class AnimeProductions(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXXModel?
)
fun AnimeProductions.toDomain() = AnimeProductionsModel(links)
