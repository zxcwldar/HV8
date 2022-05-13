package com.example.domain.models.animemodel


data class PosterImageModel(
    val tiny: String?,
    val large: String?,
    val small: String?,
    val medium: String?,
    val original: String?,
    val meta: MetaModel?
)