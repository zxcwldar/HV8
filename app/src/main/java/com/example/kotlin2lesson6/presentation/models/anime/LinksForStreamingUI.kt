package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXXModel


data class LinksXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXModel.toUI() = LinksXXXXXXXXXUI(self, related)
