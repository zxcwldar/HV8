package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.AnimeCharacters

data class AnimeCharacters(
    val links: LinksXXXXXXXXXXXXXXXModel?
)
fun AnimeCharacters.toUI() = com.example.kotlin2lesson6.presentation.models.anime.AnimeCharacters(links?.toUI())
