package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.GenresModel

data class GenresModelUI(
    val links: LinksXModelUI?
)
fun GenresModel.toUI() = GenresModelUI(links?.toUI())