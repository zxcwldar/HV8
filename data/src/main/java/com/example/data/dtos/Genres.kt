package com.example.data.dtos

import com.example.domain.model.GenresModel
import com.example.domain.model.LinksXModel

data class Genres(
    val links: LinksXModel?
)
fun Genres.toDomain() = GenresModel(links)