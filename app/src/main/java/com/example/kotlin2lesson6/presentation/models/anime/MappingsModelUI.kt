package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.MappingsModel

data class MappingsModelUI(
    val links: LinksXXXXXModelUI?
)
fun MappingsModel.toUI() = MappingsModelUI(links?.toUI())