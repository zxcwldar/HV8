package com.example.data.remote.manga


import com.google.gson.annotations.SerializedName
import com.example.domain.models.manga.MappingsModel

data class Mappings(
    @SerializedName("links")
    val links: LinksXXXXX
)

fun Mappings.toDomain() = MappingsModel(links.toDomain())