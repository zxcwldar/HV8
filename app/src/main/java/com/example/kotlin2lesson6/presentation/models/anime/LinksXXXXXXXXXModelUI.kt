package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXXXXXModel

data class LinksXXXXXXXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXModel.toUI() = LinksXXXXXXXXXModelUI(self, related)