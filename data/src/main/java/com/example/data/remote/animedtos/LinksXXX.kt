package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXX.toDomain() = LinksXXXModel(self  , related)