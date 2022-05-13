package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXModel

data class LinksXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXModel.toUI() = LinksXXModelUI(self, related)