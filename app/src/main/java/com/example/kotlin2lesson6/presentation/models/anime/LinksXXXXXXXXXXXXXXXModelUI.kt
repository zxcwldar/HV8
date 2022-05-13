package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.LinksXXXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXXXXModel(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXXXXXXXXModel.toUI() = com.example.kotlin2lesson6.presentation.models.anime.LinksXXXXXXXXXXXXXXXModel(self,related)