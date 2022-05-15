package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.SmallModel


data class SmallUI(
    val width: Int?,
    val height: Int?
)

fun SmallModel.toUI() = SmallUI(width, height)
