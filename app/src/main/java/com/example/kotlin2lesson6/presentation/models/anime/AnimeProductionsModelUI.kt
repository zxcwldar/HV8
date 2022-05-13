package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.AnimeProductionsModel

data class AnimeProductionsModelUI(
    val links: LinksXXXXXXXXXXXXXXModelUI?
)
fun AnimeProductionsModel.toUI() = AnimeProductionsModelUI(links?.toUI())
