package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.DimensionsXModel
import com.example.domain.models.animemodel.LargeXModel
import com.example.domain.models.animemodel.SmallXModel
import com.example.domain.models.animemodel.TinyXModel
import com.google.gson.annotations.SerializedName

data class DimensionsX(
    @SerializedName("tiny")
    val tiny: TinyXModel?,
    @SerializedName("large")
    val large: LargeXModel?,
    @SerializedName("small")
    val small: SmallXModel?
)
fun DimensionsX.toDomain() = DimensionsXModel(tiny, large, small)