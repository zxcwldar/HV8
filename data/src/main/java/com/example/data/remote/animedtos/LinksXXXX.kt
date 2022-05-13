package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXXX.toDomain() = LinksXXXXModel(self, related)