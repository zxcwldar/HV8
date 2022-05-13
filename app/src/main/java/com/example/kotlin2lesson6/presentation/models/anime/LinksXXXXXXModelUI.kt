package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXXModel

data class LinksXXXXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXModel.toUI() = LinksXXXXXXModelUI(self, related)