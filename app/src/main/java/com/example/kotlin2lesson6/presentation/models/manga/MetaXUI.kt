package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.MetaXModel

data class MetaXUI(
    val dimensionsXUI: DimensionsXUI
)

fun MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())
