package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.AnimeCharacters
import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class AnimeCharacters(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXXXModel?
)
fun AnimeCharacters.toDomain() = AnimeCharacters(links)