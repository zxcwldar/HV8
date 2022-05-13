package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.AnimeModel

data class AnimeModelUI(
    val data: List<DataModelUI>?
)

fun AnimeModel.toUI() = AnimeModelUI(data?.map { it.toUI() })