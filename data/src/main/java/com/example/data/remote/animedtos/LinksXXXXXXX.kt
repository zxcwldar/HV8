package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXXXXXX.toDomain() = LinksXXXXXXXModel(self, related)