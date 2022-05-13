package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXXXModel(self, related)