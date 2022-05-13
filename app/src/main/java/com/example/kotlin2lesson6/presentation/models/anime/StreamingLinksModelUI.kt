package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.animemodel.StreamingLinksModel


data class StreamingLinksModelUI(
    val links: LinksXXXXXXXXXXXXXModelUI?
)
fun StreamingLinksModel.toUI() = StreamingLinksModelUI(links?.toUI())