package com.example.data.dtos

import com.example.domain.model.LinksXXXXXXXModel
import com.example.domain.model.MediaRelationshipsModel

data class MediaRelationships(
    val links: LinksXXXXXXXModel?
)
fun MediaRelationships.toDomain() = MediaRelationshipsModel(links)