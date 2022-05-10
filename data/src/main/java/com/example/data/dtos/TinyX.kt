package com.example.data.dtos

import com.example.domain.model.TinyXModel

data class TinyX(
    val width: Int?,
    val height: Int?
)
fun TinyX.toDomain() = TinyXModel(width, height)