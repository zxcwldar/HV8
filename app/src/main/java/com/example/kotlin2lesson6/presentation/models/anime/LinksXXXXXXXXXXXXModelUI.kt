package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXModelUI(self, related)