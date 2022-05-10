package com.example.data.dtos

import com.example.domain.model.CoverImageModel
import com.example.domain.model.MetaXModel

data class CoverImage(
    val tiny: String?,
    val large: String?,
    val small: String?,
    val original: String?,
    val meta: MetaXModel?
)
fun CoverImage.toDomain() = CoverImageModel(tiny, large, small, original, meta)