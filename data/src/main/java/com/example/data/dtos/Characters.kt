package com.example.data.dtos

import com.example.domain.model.CharactersModel

data class Characters(
    val links: LinksXXXXXXXXModel?
)
fun Characters.toDomain() = CharactersModel(links)