package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.MediumModel

data class MediumUI(
    val width: Int?,
    val height: Int?
)

fun MediumModel.toUI() = MediumUI(width, height)
