package com.example.data.dtos

import com.example.domain.model.DimensionsModel
import com.example.domain.model.MetaModel

data class Meta(
    val dimensions: DimensionsModel?
)
fun Meta.toDomain() = MetaModel(dimensions)