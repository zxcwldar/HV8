package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.MediaRelationshipsModel


data class MediaRelationshipsModelUI(
    val links: LinksXXXXXXXModelUI?
)
fun MediaRelationshipsModel.toUI() = MediaRelationshipsModelUI(links?.toUI())