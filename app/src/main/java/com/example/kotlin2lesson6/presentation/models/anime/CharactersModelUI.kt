package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.CharactersModel

data class CharactersModelUI(
    val links: LinksXXXXXXXXModelUI?
)
fun CharactersModel.toUI() = CharactersModelUI(links?.toUI())