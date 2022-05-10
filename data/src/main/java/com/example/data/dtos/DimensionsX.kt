package com.example.data.dtos

import com.example.domain.model.DimensionsXModel
import com.example.domain.model.LargeXModel
import com.example.domain.model.SmallXModel
import com.example.domain.model.TinyXModel

data class DimensionsX(
    val tiny: TinyXModel?,
    val large: LargeXModel?,
    val small: SmallXModel?
)
fun DimensionsX.toDomain() = DimensionsXModel(tiny, large, small)