package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.SmallXModel


data class SmallXUI(
    val width: Int?,
    val height: Int?
)

fun SmallXModel.toUI() = SmallXUI(width, height)
