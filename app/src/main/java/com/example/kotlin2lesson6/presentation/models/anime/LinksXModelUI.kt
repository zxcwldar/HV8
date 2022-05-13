package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXModel

data class LinksXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXModel.toUI() = LinksXModelUI(self, related)