package com.example.data.dtos

import com.example.domain.model.SmallXModel

data class SmallX(
    val width: Int?,
    val height: Int?
)
fun SmallX.toDomain() = SmallXModel(width, height)