package com.example.kotlin2lesson6.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LinksXXXModel

data class LinksXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXModel.toUI() = LinksXXXUI(
    self, related
)