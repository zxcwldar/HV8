package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.CastingsModel
import com.example.domain.models.animemodel.LinksXXXModel
import com.google.gson.annotations.SerializedName

data class Castings(
    @SerializedName("links")
    val links: LinksXXXModel?
)
fun Castings.toDomain() = CastingsModel(links)