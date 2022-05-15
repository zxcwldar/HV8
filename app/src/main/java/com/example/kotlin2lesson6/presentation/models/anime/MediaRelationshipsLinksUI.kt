package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXModel


data class LinksXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXModel.toUI() = LinksXXXXXXXUI(self, related)
