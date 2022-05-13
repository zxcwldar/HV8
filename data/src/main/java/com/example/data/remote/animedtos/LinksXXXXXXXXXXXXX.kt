package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXXModel(self, related)