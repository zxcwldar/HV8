package com.example.data.dtos

import com.example.domain.model.LargeModel

data class Large(
    val width: Int?,
    val height: Int?
)
fun Large.toDomain() = LargeModel(width, height)