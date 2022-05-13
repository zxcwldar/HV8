package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.MediumModel

data class MediumModelUI(
    val width: Int?,
    val height: Int?
)
fun MediumModel.toUI() = MediumModelUI(width, height)