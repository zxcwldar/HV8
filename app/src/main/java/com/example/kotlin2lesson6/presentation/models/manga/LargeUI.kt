package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.LargeModel

data class LargeUI(
    val width: Int?,
    val height: Int?
)

fun LargeModel.toUI() = LargeUI(width, height)
