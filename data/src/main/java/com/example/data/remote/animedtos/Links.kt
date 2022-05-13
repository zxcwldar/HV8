package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksModel
import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self")
    val self: String?
)
fun Links.toDomain() = LinksModel(self)