package com.example.data.dtos

import com.example.domain.model.MediumModel

data class Medium(
    val width: Int?,
    val height: Int?
)
fun Medium.toDomain() = MediumModel(width, height)