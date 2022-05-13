package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXModel
import com.example.domain.models.animemodel.MappingsModel
import com.google.gson.annotations.SerializedName

data class Mappings(
    @SerializedName("links")
    val links: LinksXXXXXModel?
)
fun Mappings.toDomain() = MappingsModel(links)