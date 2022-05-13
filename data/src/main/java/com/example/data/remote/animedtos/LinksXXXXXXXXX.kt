package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXXXXXXXX.toDomain() = LinksXXXXXXXXXModel(self, related)