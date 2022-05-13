package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.SmallXModel

data class SmallXModelUI(
    val width: Int?,
    val height: Int?
)
fun SmallXModel.toUI() = SmallXModelUI(width, height)