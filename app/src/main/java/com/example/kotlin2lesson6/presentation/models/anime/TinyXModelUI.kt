package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.TinyXModel

data class TinyXModelUI(
    val width: Int?,
    val height: Int?
)
fun TinyXModel.toUI() = TinyXModelUI(width, height)