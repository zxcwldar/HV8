package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXXXXXXModel

data class LinksXXXXXXXXXXModelUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXModelUI(self, related)