package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.EpisodesModel


data class EpisodesUI(
    val links: LinksXXXXXXXXUI
)

fun EpisodesModel.toUI() = EpisodesUI(links.toUI())
