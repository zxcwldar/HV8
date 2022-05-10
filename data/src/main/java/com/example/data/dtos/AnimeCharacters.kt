package com.example.data.dtos

import com.example.domain.model.AnimeCharacters
import com.example.domain.model.LinksXXXXXXXXXXXXXXXModel

data class AnimeCharacters(
    val links: LinksXXXXXXXXXXXXXXXModel?
)
fun AnimeCharacters.toDomain() = AnimeCharacters(links)