package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.CoverImageModel
import com.example.domain.models.animemodel.MetaXModel
import com.google.gson.annotations.SerializedName

data class CoverImage(
    @SerializedName("tiny")
    val tiny: String?,
    @SerializedName("large")
    val large: String?,
    @SerializedName("small")
    val small: String?,
    @SerializedName("original")
    val original: String?,
    @SerializedName("meta")
    val meta: MetaXModel?
)
fun CoverImage.toDomain() = CoverImageModel(tiny, large, small, original, meta)