package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.LargeXModel


data class LargeXUI(
    val width: Int?,
    val height: Int?
)

fun LargeXModel.toUI() = LargeXUI(width, height)
