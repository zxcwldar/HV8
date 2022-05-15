package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.SingleAnimeModel


data class SingleAnimeUI(
    val data: AnimeDataUI
)

fun SingleAnimeModel.toUI() = SingleAnimeUI(data.toUI())
