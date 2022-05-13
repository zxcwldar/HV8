package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.*
import com.google.gson.annotations.SerializedName

data class Dimensions(
    @SerializedName("tiny")
    val tiny: TinyModel?,
    @SerializedName("large")
    val large: LargeModel?,
    @SerializedName("small")
    val small: SmallModel?,
    @SerializedName("medium")
    val medium: MediumModel?
)
fun Dimensions.toDomain() = DimensionsModel(tiny, large, small, medium)