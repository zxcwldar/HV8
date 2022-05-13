package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXModel

data class LinksXXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXModel.toUI() = LinksXXXXModelUI(self, related)