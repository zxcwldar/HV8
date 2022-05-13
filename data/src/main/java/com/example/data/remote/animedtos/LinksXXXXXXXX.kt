package com.example.data.remote.animedtos

import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXXXXXXX.toDomain() = LinksXXXXXXXXModel(self, related)