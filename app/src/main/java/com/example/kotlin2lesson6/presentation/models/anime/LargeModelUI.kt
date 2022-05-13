package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LargeModel

data class LargeModelUI(
    val width: Int?,
    val height: Int?
)
fun LargeModel.toUI() = LargeModelUI(width, height)