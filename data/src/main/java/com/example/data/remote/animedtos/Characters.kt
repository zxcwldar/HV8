package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.CharactersModel
import com.google.gson.annotations.SerializedName

data class Characters(
    @SerializedName("links")
    val links: LinksXXXXXXXXModel?
)
fun Characters.toDomain() = CharactersModel(links)