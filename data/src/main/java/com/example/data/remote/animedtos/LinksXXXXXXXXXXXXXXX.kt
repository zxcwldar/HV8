package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXXXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXXXXModel(self, related)