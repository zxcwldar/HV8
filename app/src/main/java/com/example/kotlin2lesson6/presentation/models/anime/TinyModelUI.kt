package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.TinyModel

data class TinyModelUI(
    val width: Int?,
    val height: Int?
)
fun TinyModel.toUI() = TinyModelUI(width, height)