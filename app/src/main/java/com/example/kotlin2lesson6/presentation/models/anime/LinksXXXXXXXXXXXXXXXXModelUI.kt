package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXXXXXModelUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXXXXXModelUI(self , related)