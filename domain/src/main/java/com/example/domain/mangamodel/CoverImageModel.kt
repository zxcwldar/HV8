package com.example.domain.mangamodel

data class CoverImageModel(
    val tiny: String,
    val small: String,
    val large: String,
    val original: String,
    val meta: MetaXModel
)