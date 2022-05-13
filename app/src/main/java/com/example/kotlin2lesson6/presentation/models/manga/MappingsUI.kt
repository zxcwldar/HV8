package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())