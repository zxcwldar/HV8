package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXXXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
    )
fun LinksXXXXXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXXXXXModel(self, related)