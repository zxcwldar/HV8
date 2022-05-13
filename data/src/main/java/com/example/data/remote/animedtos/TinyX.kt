package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.TinyXModel
import com.google.gson.annotations.SerializedName

data class TinyX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)
fun TinyX.toDomain() = TinyXModel(width, height)