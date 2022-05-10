package com.example.data.dtos

import com.example.domain.model.*

data class Dimensions(
    val tiny: TinyModel?,
    val large: LargeModel?,
    val small: SmallModel?,
    val medium: MediumModel?
)
fun Dimensions.toDomain() = DimensionsModel(tiny, large, small, medium)