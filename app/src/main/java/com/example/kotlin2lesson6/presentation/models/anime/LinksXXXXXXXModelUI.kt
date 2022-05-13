package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXXXModel

data class LinksXXXXXXXModelUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXXXModel.toUI() = LinksXXXXXXXModelUI(self, related)