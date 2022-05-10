package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXXXXXXXModel
import com.example.domain.model.StreamingLinksModel

data class StreamingLinks(
    val links: LinksXXXXXXXXXXXXXModel?
)
fun StreamingLinks.toDomain() = StreamingLinksModel(links)