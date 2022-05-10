package com.example.data.dtos

import com.example.domain.model.TinyModel

data class Tiny(
    val width: Int?,
    val height: Int?
)
fun Tiny.toDomain() = TinyModel(width, height)