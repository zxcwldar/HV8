package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(width, height)
