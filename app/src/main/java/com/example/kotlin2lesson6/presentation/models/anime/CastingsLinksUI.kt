package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.LinksXXXModel


data class LinksXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXModel.toUI() = LinksXXXUI(self, related)
