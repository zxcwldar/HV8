package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXModel
import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksX.toDomain() = LinksXModel(self, related)