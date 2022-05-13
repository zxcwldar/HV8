package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXModel

data class LinksXXXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXModel.toUI() = LinksXXXXXModelUI(self, related)