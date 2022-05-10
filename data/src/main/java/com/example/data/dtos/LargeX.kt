package com.example.data.dtos

import com.example.domain.model.LargeXModel

data class LargeX(
    val width: Int?,
    val height: Int?
)
fun LargeX.toDomain() = LargeXModel(width, height)