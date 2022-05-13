package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.DimensionsXModel
import com.example.domain.models.animemodel.MetaXModel
import com.google.gson.annotations.SerializedName

data class MetaX(
    @SerializedName("dimensions")
    val dimensions: DimensionsXModel?
)
fun MetaX.toDomain() = MetaXModel(dimensions)