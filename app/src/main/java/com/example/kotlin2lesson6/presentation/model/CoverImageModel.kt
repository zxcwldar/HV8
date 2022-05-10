package com.example.domain.model

data class CoverImageModel(
    val tiny: String?,
    val large: String?,
    val small: String?,
    val original: String?,
    val meta: MetaXModel?
)