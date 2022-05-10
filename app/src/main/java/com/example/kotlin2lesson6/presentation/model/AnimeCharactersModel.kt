package com.example.kotlin2lesson6.presentation.model

import com.example.domain.model.AnimeCharacters

data class AnimeCharacters(
    val links: LinksXXXXXXXXXXXXXXXModel?
)
fun AnimeCharacters.toUI() = com.example.kotlin2lesson6.presentation.model.AnimeCharacters(links?.toUI())
