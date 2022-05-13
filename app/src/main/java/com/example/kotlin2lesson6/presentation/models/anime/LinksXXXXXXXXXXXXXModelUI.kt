package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXXModelUI(self, related)