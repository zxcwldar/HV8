package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.DimensionsModel
import com.example.domain.models.animemodel.MetaModel
import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("dimensions")
    val dimensions: DimensionsModel?
)
fun Meta.toDomain() = MetaModel(dimensions)