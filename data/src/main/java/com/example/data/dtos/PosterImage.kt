package com.example.data.dtos

import com.example.domain.model.MetaModel
import com.example.domain.model.PosterImageModel

data class PosterImage(
    val tiny: String?,
    val large: String?,
    val small: String?,
    val medium: String?,
    val original: String?,
    val meta: MetaModel?
)
fun PosterImage.toDomain() = PosterImageModel(tiny, large, small, medium, original, meta)