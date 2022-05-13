package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.SmallXModel
import com.google.gson.annotations.SerializedName

data class SmallX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)
fun SmallX.toDomain() = SmallXModel(width, height)