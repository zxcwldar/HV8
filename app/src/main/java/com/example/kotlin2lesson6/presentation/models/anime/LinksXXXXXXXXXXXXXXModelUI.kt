package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXXXModelUI(self, related)