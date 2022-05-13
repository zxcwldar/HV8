package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXModelUI( self, related)