package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.MetaXModel


data class MetaXModelUI(
    val dimensions: DimensionsXModelUI?
)
fun MetaXModel.toUI() = MetaXModelUI(dimensions?.toUI())