package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.CoverImageModel

data class CoverImageModelUI(
    val tiny: String?,
    val large: String?,
    val small: String?,
    val original: String?,
    val meta: MetaXModelUI?
)
fun CoverImageModel.toUI() = CoverImageModelUI(tiny , large , small , original , meta?.toUI())