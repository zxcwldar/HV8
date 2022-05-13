package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.EpisodesModel

data class EpisodesModelUI(
    val links: LinksXXXXXXXXXXXXModelUI?
)
fun EpisodesModel.toUI() = EpisodesModelUI(links?.toUI())