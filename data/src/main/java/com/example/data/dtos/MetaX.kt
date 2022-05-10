package com.example.data.dtos

import com.example.domain.model.DimensionsXModel
import com.example.domain.model.MetaXModel

data class MetaX(
    val dimensions: DimensionsXModel?
)
fun MetaX.toDomain() = MetaXModel(dimensions)