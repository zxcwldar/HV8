package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.EpisodesModel
import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class Episodes(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXModel?
)
fun Episodes.toDomain() = EpisodesModel(links)