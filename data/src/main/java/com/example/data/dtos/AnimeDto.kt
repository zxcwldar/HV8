package com.example.data.dtos

import com.example.domain.model.AnimeModel
import com.example.domain.model.DataModel

data class AnimeDto(
    val `data`: DataModel?
)
fun AnimeDto.toDomain() = AnimeModel(data)