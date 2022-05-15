package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.TinyXModel


data class TinyXUI(
    val width: Int?,
    val height: Int?
)

fun TinyXModel.toUI() = TinyXUI(width, height)
