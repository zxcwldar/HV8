package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXModel

data class LinksXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXModel.toUI() = LinksXXXModelUI(self, related)