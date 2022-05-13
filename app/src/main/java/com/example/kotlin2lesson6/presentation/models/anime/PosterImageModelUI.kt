package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.PosterImageModel


data class PosterImageModelUI(
    val tiny: String?,
    val large: String?,
    val small: String?,
    val medium: String?,
    val original: String?,
    val meta: MetaModelUI?
)
fun PosterImageModel.toUI() = PosterImageModelUI(tiny , large , small , medium , original , meta?.toUI())