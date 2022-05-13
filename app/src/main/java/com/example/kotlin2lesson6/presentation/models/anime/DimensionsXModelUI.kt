package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.DimensionsXModel

data class DimensionsXModelUI(
    val tiny: TinyXModelUI?,
    val large: LargeXModelUI?,
    val small: SmallXModelUI?
)
fun DimensionsXModel.toUI() = DimensionsXModelUI(tiny?.toUI() , large?.toUI() , small?.toUI())