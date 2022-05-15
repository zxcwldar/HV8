package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.MediumModel


data class MediumUI(
    val width: Int?,
    val height: Int?
)

fun MediumModel.toUI() = MediumUI(width, height)
