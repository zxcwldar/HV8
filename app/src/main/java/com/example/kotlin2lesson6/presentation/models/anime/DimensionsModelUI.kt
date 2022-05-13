package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.DimensionsModel

data class DimensionsModelUI(
    val tiny: TinyModelUI?,
    val large: LargeModelUI?,
    val small: SmallModelUI?,
    val medium: MediumModelUI?
)
fun DimensionsModel.toUI() = DimensionsModelUI(tiny?.toUI(), large?.toUI() , small?.toUI() , medium?.toUI())