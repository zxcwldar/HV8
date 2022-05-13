package com.example.kotlin2lesson6.presentation.models.manga

import com.example.domain.models.manga.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
