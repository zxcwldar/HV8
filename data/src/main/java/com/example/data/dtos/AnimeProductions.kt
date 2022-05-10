package com.example.data.dtos

import com.example.domain.model.AnimeProductionsModel
import com.example.domain.model.LinksXXXXXXXXXXXXXXModel

data class AnimeProductions(
    val links: LinksXXXXXXXXXXXXXXModel?
)
fun AnimeProductions.toDomain() = AnimeProductionsModel(links)
