package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LargeXModel

data class LargeXModelUI(
    val width: Int?,
    val height: Int?
)
fun LargeXModel.toUI() = LargeXModelUI(width, height)