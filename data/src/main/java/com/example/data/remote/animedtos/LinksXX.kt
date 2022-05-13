package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXModel
import com.google.gson.annotations.SerializedName

data class LinksXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXX.toDomain() = LinksXXModel(self, related)
