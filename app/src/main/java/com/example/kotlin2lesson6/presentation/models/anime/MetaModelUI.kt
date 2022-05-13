package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.MetaModel


data class MetaModelUI(
    val dimensions: DimensionsModelUI?
)
fun MetaModel.toUI() = MetaModelUI(dimensions?.toUI())