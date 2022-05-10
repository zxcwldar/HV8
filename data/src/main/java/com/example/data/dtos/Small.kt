package com.example.data.dtos

import com.example.domain.model.SmallModel

data class Small(
    val width: Int?,
    val height: Int?
)
fun Small.toDomain() = SmallModel(width, height)