package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.InstallmentsModel


data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
