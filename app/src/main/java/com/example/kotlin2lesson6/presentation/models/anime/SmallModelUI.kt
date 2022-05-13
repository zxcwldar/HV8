package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.SmallModel

data class SmallModelUI(
    val width: Int?,
    val height: Int?
)
fun SmallModel.toUI() = SmallModelUI(width, height)