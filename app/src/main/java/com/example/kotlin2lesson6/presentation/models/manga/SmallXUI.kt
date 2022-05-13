package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.SmallXModel

data class SmallXUI(
    val width: Int?,
    val height: Int?
)

fun SmallXModel.toUI() = SmallXUI(width, height)