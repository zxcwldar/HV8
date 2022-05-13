package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.MediumModel
import com.google.gson.annotations.SerializedName

data class Medium(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)
fun Medium.toDomain() = MediumModel(width, height)