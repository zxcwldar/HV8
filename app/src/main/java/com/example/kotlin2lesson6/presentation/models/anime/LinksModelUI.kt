package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksModel

data class LinksModelUI(
    val self: String?
)
fun LinksModel.toUI() = LinksModelUI(self)