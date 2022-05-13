package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun CastingsModel.toUI() = CastingsUI(
    links.toUI()
)
