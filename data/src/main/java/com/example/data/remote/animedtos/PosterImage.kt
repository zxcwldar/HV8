package com.example.data.remote.animedtos

import com.example.domain.models.animemodel.MetaModel
import com.example.domain.models.animemodel.PosterImageModel
import com.google.gson.annotations.SerializedName

data class PosterImage(
    @SerializedName("tiny")
    val tiny: String?,
    @SerializedName("large")
    val large: String?,
    @SerializedName("small")
    val small: String?,
    @SerializedName("medium")
    val medium: String?,
    @SerializedName("original")
    val original: String?,
    @SerializedName("meta")
    val meta: MetaModel?
)
fun PosterImage.toDomain() = PosterImageModel(tiny, large, small, medium, original, meta)