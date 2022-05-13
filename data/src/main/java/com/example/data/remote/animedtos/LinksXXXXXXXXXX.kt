package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXModel(self, related)