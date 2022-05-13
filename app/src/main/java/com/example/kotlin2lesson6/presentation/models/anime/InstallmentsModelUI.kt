package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.InstallmentsModel

data class InstallmentsModelUI(
    val links: LinksXXXXModelUI?
)
fun InstallmentsModel.toUI() = InstallmentsModelUI(links?.toUI())